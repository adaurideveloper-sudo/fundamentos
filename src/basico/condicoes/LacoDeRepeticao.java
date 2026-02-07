package basico.condicoes;

public class LacoDeRepeticao {
    public static void main(String[] args) {

        int numeroDeClones = 0;
        int numeroMaximoDeClones = 40;


        while (numeroDeClones < numeroMaximoDeClones) {
            System.out.println("O Naruto um clone das sombras " + (numeroDeClones + 1));
            numeroDeClones ++;
        }


        for (int i = 0; i <= numeroMaximoDeClones ; i++) {
            System.out.println("O Naruto esta se clonando e ja se clonou " + i + " vezes");
        }

    }
}
