/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import Mew_Bank.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author vrevy
 */
public class PainelTransferir extends JPanel implements ActionListener {

    private JLabel num_dest;
    private JTextField txt_numdest;
    private JLabel num_trf;
    private JTextField txt_numtrf;
    private JLabel valor;
    private JTextField txt_valor;
    private JButton confirmar;
    private JButton btn_cancela;
    private ArrayList<Conta> contas;
    private int numConta;
    private BuscaContaCliente bc;
    
    
    public JTextField getTxt_numdest() {
        return txt_numdest;
    }

    public JTextField getTxt_numtrf() {
        return txt_numtrf;
    }

    public JTextField getTxt_valor() {
        return txt_valor;
    }

    public JButton getConfirmar() {
        return confirmar;
    }

    public JButton getBtn_cancela() {
        return btn_cancela;
    }

    public PainelTransferir(ArrayList<Conta> c) {
        contas= new ArrayList<>();
        contas=c;
        bc=new BuscaContaCliente(contas);
        
        num_dest = new JLabel("Número da Conta de Destino");
        txt_numdest = new JTextField(35);
        num_trf = new JLabel("Número da Conta Remetente");
        txt_numtrf = new JTextField(35);
        valor = new JLabel("Valor que deseja Depositar");
        txt_valor = new JTextField(35);
        confirmar = new JButton("Confirmar");
        btn_cancela = new JButton("Cancelar");
        setLayout(new FlowLayout(FlowLayout.CENTER, 20, 30));
        add(num_dest);
        add(txt_numdest);
        add(num_trf);
        add(txt_numtrf);
        add(valor);
        add(txt_valor);
        add(confirmar);
        add(btn_cancela);
        getConfirmar().addActionListener(this);

        setSize(430, 400);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src = new Object();
        src = e.getSource();
        if (src == getConfirmar()) {
            numConta=Integer.parseInt(txt_numtrf.getText());
            int numContad=Integer.parseInt(txt_numdest.getText());
            int valor=Integer.parseInt(txt_valor.getText());
            int indicer = bc.procuraConta(numConta);
            int indiced = bc.procuraConta(numContad);
            
            if(indicer!=-1 && indiced !=-1){
                contas.get(indicer).transfere(valor,contas.get(indiced));
                System.out.println("Novo Saldo da conta de destino: "+contas.get(indiced).getSaldo()+"\n Novo saldo da conta"
                        + " remetente: "+ contas.get(indicer).getSaldo());
            }

        }
    }

}
