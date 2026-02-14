package intermediario;

public class Hatake extends Ninja implements  SharinganInterface, Ambuinterface {

    public Hatake() {
        super();
    }
    public Hatake(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Hatake(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    @Override
    public void ninjaDeElite() {
        System.out.println(nome +": eu sou ninja de elite da Anbu.");
    }

    @Override
    public  void SharinganAtivado() {
        System.out.println(nome +": Ativou o Sharingan");

    }

    public void boasVindas() {
        System.out.println("Eu sou " + nome + " do cla Hatake.");
    }
}
