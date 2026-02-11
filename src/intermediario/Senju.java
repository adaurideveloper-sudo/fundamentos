package intermediario;

public class Senju extends Hokage{

    public Senju() {

    }

    @Override
    public void sabedoriaHokage() {
        System.out.println("Voce ganhou sabedoria");
    }

    public Senju(String nome) {
        this.nome = nome;
    }
    public Senju(int idade) {
        this.idade = idade;
    }

    public Senju(String nome, int idade, boolean vivoOuNao) {
        super(nome, idade, vivoOuNao);
    }


}
