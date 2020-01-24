/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Mew_Bank;

/**
 *
 * @author brend
 */
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author brend
 */
public class Arquivo implements Serializable {

    private ArrayList<Conta> contas;

    public Arquivo(ArrayList<Conta> c) {
        contas= new ArrayList<>();
        contas=c;
    }

    public void escreveArquivo() throws IOException {
        FileOutputStream arquivoGrav = new FileOutputStream("Teste.dat");
        ObjectOutputStream objGravar= new ObjectOutputStream(arquivoGrav);
        objGravar.writeObject(contas);
        objGravar.flush();
        objGravar.close();
        arquivoGrav.flush();
        arquivoGrav.close();
        System.out.println("Arquivo gravado sucesso!!");
    }
    public ArrayList lerArquivo() throws IOException, ClassNotFoundException{
       FileInputStream arquivoLeitura = new FileInputStream("Teste.dat");
       ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
       contas=(ArrayList<Conta>) objLeitura.readObject(); //Cast, pois a função de leitura retorna um objeto;
       objLeitura.close();
       arquivoLeitura.close();
       return contas;
    }
}
