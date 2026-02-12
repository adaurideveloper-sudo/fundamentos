package intermediario.classeabstratavsinterface;

public class Main {
    public static void main(String[] args) {

        Uzumaki ninja = new Uzumaki();
        ninja.nomeDoNinja();
        ninja.lancarShuriken();

        Uchiha Sasuke = new Uchiha();
        Sasuke.nome = "Sasuke Uchiha";
        Sasuke.nomeDoNinja();
        Sasuke.lancarKunai();
    }
}
