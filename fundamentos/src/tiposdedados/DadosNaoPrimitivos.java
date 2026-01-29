package tiposdedados;

public class DadosNaoPrimitivos {
    public static void main(String[] args) {
        /*
            Dados  não primitivos - String, Array, Class, enum
            Objetivo da aula: criar um ninja e atribuir métodos a ele
        */

        String nome = "Naruto Uzumaki";
        String nomeEmCaixaAlta = nome.toUpperCase();// toUpperCase coloca tudo em CAPSLOCK
        System.out.println("Este texto esta em CAPSLOCK: " + nomeEmCaixaAlta);
    }
}
