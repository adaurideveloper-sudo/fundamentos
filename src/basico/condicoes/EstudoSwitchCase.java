package basico.condicoes;

import java.util.Scanner;

import static java.lang.System.*;

public class EstudoSwitchCase {
    public static void main(String[] args) {

        /*
        * Switch case: Servem para gerar casos especificos
        * Objetivo: Pedir para o usuario escolher entre os ninjas
        * */

        // Pedir para o usuario
        Scanner scanner=new Scanner(in);

        // Mostrar opcoes para o usuario
        out.println("escolha um personagem: ");
        out.println("1 - Naruto Uzumaki");
        out.println("2 - Sasuke Uchiha ");
        out.println("3 - Sakura Haruno");

        // Pedir par o usuario escolher uma das opcoes
         int escolhaDoUsuario = scanner.nextInt();

        // Reacao ao escolher um personagem
        switch (escolhaDoUsuario) {
            case 1:
                out.println("O usuario escolheu o Naruto Uzumaki");
                break;
            case 2:
                out.println("O usuario escolheu o Sasuke Uchiha");
                break;
            case 3:
                out.println("O usuario escolheu a Sakura Haruno");
                break;
            default:
                out.println("voce nao digitou uma alternativa valida! Tente novamente.");
        }

        // fechar a caixa
        scanner.close();

    }
}
