package desafio1;

public class Main {
    public static void main(String[] args) {

        //Ninja 1
        String nomeNinja1 = "Naruto Uzumaki";
        int idade = 16;
        String missao = "encontrar o bandido";
        String statusDaMissao = "em andamento";
        char nivelDaMissao = 'A';

        //Verificar nivel da missao e idade do ninja

        if(idade < 15){
            if (nivelDaMissao == 'C' || nivelDaMissao == 'D'){
                statusDaMissao = "concluida";
            } else {
                statusDaMissao = "Não concluida idade insuficiente";
            }
        } else {
                statusDaMissao = "concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja1);
        System.out.println("Idade do ninja: " + idade);
        System.out.println("Missao: " + missao);
        System.out.println("Status da missao: " + statusDaMissao);
        System.out.println("Nivel da missao: " + nivelDaMissao);
        System.out.println("-----------------------");

        //Ninja 2
        String nomeNinja2 = "Sasuke Uchiha";
        int idade2 = 19;
        String missao2 = "reconhecimentos da aldeia";
        String statusDaMissao2 = "em andamento";
        char nivelDaMissao2 = 'S';

        if(idade <= 15){
            if (nivelDaMissao2 == 'C' || nivelDaMissao2 == 'D'){
                statusDaMissao2 = "concluida";
            } else {
                statusDaMissao2 = "Não concluida, idade insuficiente";
            }
        } else {
            statusDaMissao2 = "concluida";
        }

        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja2);
        System.out.println("Idade do ninja: " + idade2);
        System.out.println("Missao: " + missao2);
        System.out.println("Status da missao: " + statusDaMissao2);
        System.out.println("Nivel da missao: " + nivelDaMissao2);
        System.out.println("-----------------------");

        //Ninja 3
        String nomeNinja3 = "Sakura Haruno";
        int idade3 = 14;
        String missao3 = "curar os feridos da guerra";
        String statusDaMissao3 = "concluido";
        char nivelDaMissao3 = 'A';



        System.out.println("-----------------------");
        System.out.println("Nome do ninja: " + nomeNinja3);
        System.out.println("Idade do ninja: " + idade3);
        System.out.println("Missao: " + missao3);
        System.out.println("Status da missao: " + statusDaMissao3);
        System.out.println("Nivel da missao: " + nivelDaMissao3);
        System.out.println("-----------------------");
    }
}
