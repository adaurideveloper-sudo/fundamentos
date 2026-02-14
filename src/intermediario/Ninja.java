package intermediario;

public abstract class Ninja implements ExtategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    public Ninja() {
    }

    public Ninja(String nome, String aldeia, int idade) {
        this.nome = nome;
        this.aldeia = aldeia;
        this.idade = idade;
    }

    // Metodo geral - todos o ninjas irao ter
    public void habilidadeEspecial(){
        System.out.println("Meu nome é " + nome + " e essa é minha habilidade especial.");
    }

    // Sobreescrevendo metodo
    @Override
    public void estrategiaDeBatalhaNinja() {
        System.out.println("Meu nome é " + nome + " e essa é minha estrategia de combate!!!");
    }

    int idadeMinimaParaSerHokage;

    public int anosParaSerHokage(int idadeMinimaParaSerHokage){
        return idadeMinimaParaSerHokage - idade;
    }

}
