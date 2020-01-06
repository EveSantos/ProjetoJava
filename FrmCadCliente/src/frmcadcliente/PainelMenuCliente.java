/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmcadcliente;

import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author brend
 */
public class PainelMenuCliente extends JPanel {

    private JButton btn_criarConta;
    private JButton btn_editarConta;

    public JButton getBtn_voltar() {
        return btn_voltar;
    }
    private JButton btn_excluirConta;

    public JButton getBtn_criarConta() {
        return btn_criarConta;
    }
    private JButton btn_buscarConta;
    private JButton btn_voltar;
    
    public PainelMenuCliente() {
        btn_criarConta = new JButton("Criar Conta");
        btn_editarConta = new JButton("Editar Conta");
        btn_excluirConta = new JButton("Excluir Conta");
        btn_buscarConta = new JButton("Buscar Conta");
        btn_voltar = new JButton("Voltar");

        LayoutManager lm2 = new GridLayout(5, 1);
        setLayout(lm2);
        add(btn_criarConta);
        add(btn_editarConta);
        add(btn_excluirConta);
        add(btn_buscarConta);
        add(btn_voltar);
    }
    public JPanel actionCriarConta(){
        return new JPanel();
        
    }
    
}
