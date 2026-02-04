package condicoes;

public class IfEElse {
    static void main(String[] args) {
       String nome = "Naruto Uzumaki";

       /*
       * IF e ELSE
       * ELSE IF
       * Objetivo: Passar o ninja de nivel de acordo como numero de missoes
       * */

        // Ninja Naruto
        int idade = 10;
        String rank;
        boolean hokge = false;
        short numeroDeMissoes = 20;


        /*
        * if (condicao) {resultado}
        * else if (condicao) {resultado}
        * else {resultado caso nada seja verdadeiro}
        * */


        //se (condicao) {faca isso}
        if (numeroDeMissoes == 10 && idade > 15) {
            System.out.println("rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            System.out.println("rank: Jonnin");
        } else {
            System.out.println("Rank: Gennim");
        }





    }
}
