package intermediario;

public class Uchiha extends Ninja {

    public Uchiha() {
        super();
    }

    public Uchiha(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public  void SharinganAtivado() {
        System.out.println("Meu nome é " + nome + ". O Sharingan ativou, eu sou um Uchiha.");
    }
}
