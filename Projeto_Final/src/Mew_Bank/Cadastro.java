package Mew_Bank;

import java.util.*;

/**
 *
 * @author brend
 */
public class Cadastro {

    private static ArrayList<Conta> contas = new ArrayList<>();
    private Cliente cliente;
    private static int tamanho;

    public static int getTamanho() {
        return tamanho = contas.size();
    }

    public boolean criaConta(Conta conta) {
        contas.add(conta);

        return true;
    }

    public boolean removeConta(int numConta) {
        if (procuraConta(numConta) != -1) {
            int indice = procuraConta(numConta);
            contas.remove(indice);
            return true;
        }
        return false;
    }

    public int procuraConta(int numConta) {
        if (contas.isEmpty()) {
            System.out.println("Não tem nada");
            return -1;
        } else {
            for (int i = 0; i < getTamanho(); i++) {
                if (contas.get(i).getNumConta() == numConta) {
                    System.out.println("Encontrei a conta  na posição" + i);
                    return i;
                }

            }
            return -1;
        }
    }

    public static ArrayList<Conta> getContas() {
        return contas;
    }

}
