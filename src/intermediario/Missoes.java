package intermediario;

public class Missoes{

    private String nome;
    private RankDeMissoes rank;

    //Metodo para mostrar informacoes
    public void exibirDetalhes() {
        System.out.printf("Missao: %s - Rank: %s (Descricao: %s) Dificuldade: %s%n",
                nome, rank, rank.getDescricao(), rank.getDificuldade());
    }
    public Missoes(String nome, RankDeMissoes rank) {
        this.nome = nome;
        this.rank = rank;
    }

    protected RankDeMissoes getRank() {
        return rank;
    }

    public void setRank(RankDeMissoes rank) {
        this.rank = rank;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
