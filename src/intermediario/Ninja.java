package intermediario;

public abstract class Ninja implements ExtategiaDeBatalha {
    String nome;
    String aldeia;
    int idade;

    // Metodo geral - todos o ninjas irao ter
    public void habilidadeespecial(){
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
