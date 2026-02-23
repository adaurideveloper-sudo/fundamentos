package intermediario.record;

public record RecordNinja(String nome, String email, int telefone) {
    public RecordNinja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public RecordNinja cadastrarNinja(String nome, String email, int telefone) {
        RecordNinja novoNinja = new RecordNinja(nome, email, telefone);
        System.out.println("Ninja cadastrado com sucesso!");
        System.out.println(novoNinja);
        return novoNinja;
    }
}

