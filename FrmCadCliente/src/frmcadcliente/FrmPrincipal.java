/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmcadcliente;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author brend
 */
public class FrmPrincipal extends JFrame implements ActionListener{

    private JSplitPane split;
    private FrmCadCliente cad;
    private PainelMenu menu;
    private PainelMenuCliente menuCliente;
    public FrmPrincipal() {
        split = new JSplitPane();
        cad = new FrmCadCliente();
        menu= new PainelMenu();
        menuCliente = new PainelMenuCliente();
        getContentPane().add(split);
        split.setLeftComponent(menu);
        split.setRightComponent(cad);

        menu.getBtn_cliente().addActionListener(this);
        menu.getBtn_gerencia().addActionListener(this);
        menuCliente.getBtn_voltar().addActionListener(this);
        menuCliente.getBtn_criarConta().addActionListener(this);
        setSize(600,400);
        setLocationRelativeTo(null);
        setVisible(true);
        
    }

    public JSplitPane getSplit() {
        return split;
    }

    public static void main(String args[]) {
        FrmPrincipal frm = new FrmPrincipal();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object src =e.getSource();
        if(src== menu.getBtn_cliente()){
            split.remove(1);
            split.setLeftComponent(menuCliente);
        }
        if(src==menuCliente.getBtn_voltar()){
            split.remove(1);
            split.setLeftComponent(menu);
            split.setRightComponent(new JPanel());
        }
        if(src==menuCliente.getBtn_criarConta()){
            split.setRightComponent(menuCliente.actionCriarConta());
            
        }
        
    }
}
