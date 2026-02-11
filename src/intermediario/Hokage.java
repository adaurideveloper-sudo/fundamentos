package intermediario;

public abstract class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;
    int missoes;
    double saldoBancario;
    double altura;

    public abstract  void sabedoriaHokage();

    public Hokage(String nome, int idade, boolean vivoOuNao, String aldeia, int missoes) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
        this.aldeia = aldeia;
        this.missoes = missoes;
    }

    public Hokage() {

    }
}
