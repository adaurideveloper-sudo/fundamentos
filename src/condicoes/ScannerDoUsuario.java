package condicoes;

import java.util.Scanner;

public class ScannerDoUsuario {

    public static void main(String[] args) {

        /*
         * Scanner- è um jeito de trazer o usuario para dentro da aplicacao
         * Objetivo: o usuario ira criar um ninja e validar os dados
         * */

        Scanner caixaDeTexto = new Scanner(System.in);

        String nomeDoNinja = caixaDeTexto.nextLine();
        System.out.println("O nome do ninja é: " + nomeDoNinja);

        // Receber a idade do ninja
        System.out.println("Escreva aqui a idade do seu ninja: ");
        int idadeDoNinja = caixaDeTexto.nextInt();
        System.out.println("A idade do ninja é: " + idadeDoNinja + " anos");

        // Tratamento de dados
        if (idadeDoNinja >= 18) {
            System.out.println("Esse ninja ja é maior de idade e pode ir para missoes fora da vila");
        } else {
            System.out.println("Esse ninja é muito novo ainda, precisa treinar mais antes de sair da vila");
        }


        //fechar sempre o Scanner
        caixaDeTexto.close();
    }




}
