package intermediario;

public class Hokage {
    String nome;
    int idade;
    boolean vivoOuNao;
    String aldeia;

    public Hokage(String nome){
        this.nome = nome;
    }

    public Hokage(int idade){
        this.idade = idade;
    }

    // All args constructor
    public Hokage(String nome, int idade, boolean vivoOuNao) {
        this.nome = nome;
        this.idade = idade;
        this.vivoOuNao = vivoOuNao;
    }

    public Hokage(){

    }

}
