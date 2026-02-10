package intermediario;

public class Ninja {
    String nome;
    String aldeia;
    int idade;

    // Dentro da classe Ninja
    public Ninja() {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }




    int idadeMinimaParaSerHokage;


    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
