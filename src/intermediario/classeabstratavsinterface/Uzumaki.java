package intermediario.classeabstratavsinterface;

public class Uzumaki implements NinjaInterface {

    static String nome = "Naruto Uzumaki";
    String aldeia = "Aldeia da Folha";
    int idade = 17;

    public void HabilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial.");
    }
    public void  lancarShuriken() {
        System.out.println("Eu lancei uma shuriken!!!");
    }


    public void nomeDoNinja() {
        System.out.println("Meu nome é: "+ nome);


    }
}
