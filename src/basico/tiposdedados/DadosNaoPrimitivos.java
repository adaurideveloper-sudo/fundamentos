package basico.tiposdedados;

import static java.lang.System.*;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
            Dados  não primitivos - String, Array, Class, enum
            Objetivo da aula: criar um ninja e atribuir métodos a ele
        */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();// toUpperCase coloca tudo em CAPSLOCK
        out.println("Este texto esta em CAPSLOCK: " + nomeEmCaixaAlta);


        String aldeia = "Aldeia da Folha";
        String aldeiaCaixaBaixa = aldeia.toLowerCase();;//vai colocar tudo em caixa baixa
        out.println("Este texto esta em caixa: " + aldeiaCaixaBaixa + ".");
    }
}
