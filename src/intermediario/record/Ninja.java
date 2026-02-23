package intermediario.record;

public record Ninja(String nome, String email, int telefone) {

    public Ninja cadastrarNinja(String nome, String email, int telefone) {
        Ninja novoNinja = new Ninja(nome, email, telefone);
        System.out.println("Ninja cadastrado com sucesso!");
        System.out.println(novoNinja);
        return novoNinja;
    }
}

