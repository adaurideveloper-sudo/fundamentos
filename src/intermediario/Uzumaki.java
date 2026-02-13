package intermediario;

public class Uzumaki extends Ninja{

    public Uzumaki() {
    }

    public Uzumaki(String nome, String aldeia, int idade) {
        super(nome, aldeia, idade);
    }

    public void ModoSabioAtivado(){
        System.out.println("Meu nome é " + nome + ". E eu ativei o modo sabio.");
    }
}
