package intermediario;

public class Uzumaki extends Ninja implements HabilidadeEspecialInterface{

    Biju biju;

    public Uzumaki(String narutoUzumaki, String aldeiaPadrao, int i, int i1, NivelNinja genin, Biju kurama) {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public Uzumaki(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        super(nome, aldeia, idade, numeroDeMissoesConcluidas, rank);
        this.biju = biju;
    }

    public void ModoSabioAtivado(){
        System.out.println("Meu nome é " + nome + ". E eu ativei o modo sabio.");
    }

    @Override
    public void habilidadeEspecial() {
        System.out.println("Meu nome é " + nome + " e esse é meu ataque Uchiha, um ataque de vento. Eu ja completei: " + numeroDeMissoesConcluidas + " missoes.");
    }


}
