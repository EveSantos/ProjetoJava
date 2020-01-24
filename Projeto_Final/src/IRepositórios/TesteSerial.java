/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IRepositórios;
import Mew_Bank.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author brend
 */
public class TesteSerial implements Serializable{
    private ArrayList<String> array;
    public TesteSerial(){
        array= new ArrayList<>();
    }
    public void SalvaArquivo(){
        
    }
    
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       TesteSerial teste= new TesteSerial();
       ArrayList<String> nomes;
        String nome,nome2;
        nome="Brendon";
        nome2="Souza";
        teste.array.add(nome);
        teste.array.add(nome2);
    
    FileOutputStream arquivoGrav = new FileOutputStream("Teste.dat");
        ObjectOutputStream objGravar= new ObjectOutputStream(arquivoGrav);
        objGravar.writeObject(teste.array);
        objGravar.flush();
        objGravar.close();
        arquivoGrav.flush();
        arquivoGrav.close();
        System.out.println("Arquivo gravado sucesso!!");

       FileInputStream arquivoLeitura = new FileInputStream("Teste.dat");
       ObjectInputStream objLeitura = new ObjectInputStream(arquivoLeitura);
       nomes=(ArrayList<String>) objLeitura.readObject(); //Cast, pois a função de leitura retorna um objeto;
       objLeitura.close();
        arquivoLeitura.close();
        System.out.println(nomes.get(0)+"\n"+nomes.get(1));
    
    }

    
}
