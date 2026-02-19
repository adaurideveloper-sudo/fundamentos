package intermediario;

public class Uchiha extends Ninja implements  SharinganInterface, HabilidadeEspecialInterface{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uchiha(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
    }
     /*
     * Metodo: Omplementado da interface SharinganInterface
     * */
    @Override
    public void SharinganAtivado() {
        System.out.println(getNome() +": Ativou o Sharingan");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + getNome() + " e esse é meu ataque Uchiha, um ataque de fogo. Eu ja completei: " + getNumeroDeMissoesConcluidas() + " missoes.");
    }

}
