package intermediario;

import static java.lang.System.*;

public abstract class Ninja implements ExtategiaDeBatalha {

    private String nome;
    private String aldeia;
    private int idade;
    private int numeroDeMissoesConcluidas;
    private NivelNinja rank;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Sobrecarga de metodos voce  nao precisa redeclarar o construtor so os novos atributos
    public Ninja(String nome, String aldeia, int idade, int numeroDeMissoesConcluidas, NivelNinja rank) {
        this(nome, aldeia, idade);
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
        this.rank = rank;
    }

    // Sobreescrevendo metodo
    @Override
    public void estrategiaDeBatalhaNinja() {
        out.println("Meu nome é " + nome + " e essa é minha estrategia de combate!!!");
    }

    // Sobrecarga de metodo - Inteligencia de combate
    @Override
    public void inteligenciaDeCombate() {
        out.println("Meu nome é " + nome + " e essa é minha inteligencia de combate!!!");
    }
    @Override
    public void inteligenciaDeCombate(int qi) {
        if (qi > 150){
            out.println("Seu QI é: " + qi + " e voce é um gênio");
        } else if (qi >= 130) {
            out.println("Seu QI é: " + qi + " e voce é um ninja promissor");
        } else {
            out.println("Seu QI é: " + qi + " e voce precisar treinar suas estrategias");
        }
    }
    @Override
    public String toString() {
        return "Meu nome é "+ nome + ", " + "sou da: "+ aldeia + " " + "e tenho " + idade + " anos, ";
    }

    public String getNome() {
        return nome;
    }

    public String getAldeia() {
        return aldeia;
    }

    public int getIdade() {
        return idade;
    }

    public int getNumeroDeMissoesConcluidas() {
        return numeroDeMissoesConcluidas;
    }

    public NivelNinja getRank() {
        return rank;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAldeia(String aldeia) {
        this.aldeia = aldeia;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNumeroDeMissoesConcluidas(int numeroDeMissoesConcluidas) {
        this.numeroDeMissoesConcluidas = numeroDeMissoesConcluidas;
    }

    public void setRank(NivelNinja rank) {
        this.rank = rank;
    }

    int idadeMinimaParaSerHokage;

    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
