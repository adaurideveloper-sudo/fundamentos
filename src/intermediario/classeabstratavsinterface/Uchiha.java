package intermediario.classeabstratavsinterface;

public class Uchiha extends Ninja{

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }



    public void nomeDoNinja() {
        System.out.println("Meu nome é: " + nome);
    }
}
