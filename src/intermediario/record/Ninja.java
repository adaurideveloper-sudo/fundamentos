package intermediario.record;

import java.util.ArrayList;
import java.util.List;

public class Ninja {

    private final  String  nome;
    private final String email;
    private final int telefone;

    public void cadastrarNinja(String nome, String email, int telefone){
        if (nome == null || nome.isEmpty()) {
            System.out.println("Nome inválido");
            return;
        }

        Ninja novoNinja = new Ninja(nome, email, telefone);
        System.out.println("Ninja cadastrado com sucesso!");
        System.out.println(novoNinja);
    }
    public Ninja(String nome, String email, int telefone) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefone() {
        return telefone;
    }

    @Override
    public String toString() {
        return "Ninja{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", telefone=" + telefone +
                '}';
    }
}
