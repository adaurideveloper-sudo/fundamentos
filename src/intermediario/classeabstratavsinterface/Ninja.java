package intermediario.classeabstratavsinterface;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;


    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    public Ninja() {

    }

    //Metodos abstratos
    public abstract void nomeDoNinja();

    public void lancarKunai() {
        System.out.println("Eu lancei uma kunai!!!");
    }

}
