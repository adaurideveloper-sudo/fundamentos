package condicoes;

import static java.lang.System.*;

public class IfEElse {
    public static void main(String[] args) {

        /*
       * IF e ELSE
       * ELSE IF
       * Objetivo: Passar o ninja de nivel de acordo como numero de missoes
       * */

        // Ninja Naruto
        int idade = 10;

        short numeroDeMissoes = 20;

        if (numeroDeMissoes == 10 && idade > 15) {
            out.println("rank: Chunnin");
        } else if (numeroDeMissoes >= 20) {
            out.println("rank: Jonnin");
        } else {
            out.println("Rank: Gennim");
        }

    }
}
