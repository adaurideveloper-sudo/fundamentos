package basico.desafio;

import static java.lang.System.*;

public class Main {
    public static void main(String[] args) {
        // Exemplo Ninja 1
        exibirStatusNinja("Naruto Uzumaki", 16, "Encontrar o bandido", 'A');

        // Exemplo Ninja 2
        exibirStatusNinja("Sasuke Uchiha", 19, "Reconhecimento", 'S');

        // Exemplo Ninja 3 (Agora com a lógica aplicada)
        exibirStatusNinja("Sakura Haruno", 14, "Curar feridos", 'A');
    }

    public static void exibirStatusNinja(String nome, int idade, String missao, char nivel) {
        String status;

        // Lógica simplificada: Se for menor de 15 e a missão for difícil (não C nem D)
        if (idade < 15 && (nivel != 'C' && nivel != 'D')) {
            status = "Não concluída: idade insuficiente";
        } else {
            status = "Concluída";
        }

        out.println("-----------------------");
        out.println("Nome: " + nome);
        out.println("Idade: " + idade);
        out.println("Missão: " + missao + " [" + nivel + "]");
        out.println("Status: " + status);
        out.println("-----------------------");
    }
}