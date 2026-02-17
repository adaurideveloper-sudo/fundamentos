package intermediario;

final class Anbu extends Ninja implements SharinganInterface, Anbuinterface{

    public Anbu() {
        super();
    }

    public Anbu(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }

    public void anbu(){
        System.out.println(nome + " Eu sou um ninja da classe Anbu!");
    }
    @Override
    public void ninjaDeElite(){
        System.out.println(nome +": eu sou ninja de elite da Anbu.");
    }

    @Override
    public void SharinganAtivado() {
        System.out.println(nome +": Ativou o Sharingan");
    }
}
