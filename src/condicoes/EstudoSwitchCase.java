package condicoes;

import java.util.Scanner;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        /*
        * Switch case: Servem para gerar casos especificos
        * Objetivo: Pedir para o usuario escolher entre os ninjas
        * */

        // Pedir para o usuario
        Scanner scanner=new Scanner(System.in);

        // Mostrar opcoes para o usuario
        System.out.println("escolha um personagem: ");
        System.out.println("1 - Naruto Uzumaki");
        System.out.println("2 - Sasuke Uchiha ");
        System.out.println("3 - Sakura Haruno");

        // Pedir par o usuario escolher uma das opcoes
         int escolhaDoUsuario = scanner.nextInt();



        // fechar a caixa
        scanner.close();


    }
}
