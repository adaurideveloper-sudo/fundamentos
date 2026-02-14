package intermediario;

public abstract class Ninja implements ExtategiaDeBatalha {

    // TODO: Incluir dois novos atributos: numeroDeMissoesConcluidas, Rank
    // TODO: Rank: Genin, Chuunin, Jounnin, Hokage

    String nome;
    String aldeia;
    int idade;
    int numeroDeMissoesConcluidas;
    NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }
    // TODO: Sobrecarga do construtor chamando os novos atributos
    // Sobrecarga de metodos voce  nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Sobreescrevendo metodo
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de combate!!!");
    }

    int idadeMinimaParaSerHokage;

    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
