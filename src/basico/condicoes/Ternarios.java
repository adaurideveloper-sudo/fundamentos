package basico.condicoes;

import static java.lang.System.*;

public class Ternarios {

    public static void main(String[] args) {

        short numeroDeMissoes = 11;

        String nivelDoNinja = (numeroDeMissoes >= 10) ? "Esse ninja esta com mais de 10 missoes" : "Esse ninja tem menos de 10 missoes";

        out.println(nivelDoNinja);
    }

}
