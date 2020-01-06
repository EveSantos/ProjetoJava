/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frmcadcliente;
import java.awt.GridLayout;
import java.awt.LayoutManager;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPanel;
/**
 *
 * @author brend
 */

public class FrmCadCliente extends JPanel {
private JLabel label_nome;
private JLabel label_cpf;
private JLabel label_end;
private JTextField txt_nome;
private JTextField txt_cpf;
private JTextField txt_end;
private JButton btn_ok;
private JButton btn_cancela;

public FrmCadCliente() {
label_nome = new JLabel("Nome");
label_cpf = new JLabel("CPF");
label_end = new JLabel("End.");
btn_ok = new JButton("Confirmar");
btn_cancela = new JButton("Cancelar");
txt_nome = new JTextField();
txt_end = new JTextField();
txt_cpf = new JTextField();

LayoutManager lm = new GridLayout(4, 2);

setLayout(lm);

add(label_nome);
add(txt_nome);
add(label_end);
add(txt_end);
add(label_cpf);
add(txt_cpf);
add(btn_ok);
add(btn_cancela);

setSize(300, 600);

setVisible(true);



}


}






