package intermediario.classeabstratavsinterface;

public abstract class Ninja {

    String nome;
    String aldeia;
    int idade;

    //Metodos abstratos
    public abstract void nomeDoNinja();

    public void lancarKunai() {
        System.out.println("Eu lancei uma kunai!!!");
    }

}
