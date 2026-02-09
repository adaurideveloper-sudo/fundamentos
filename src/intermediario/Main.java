package intermediario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Entrada de Dados
        Scanner scanner = new Scanner(System.in);
        // Fazer o array
        int numeroMaximo = 5;
        String[] ninjas = new String[numeroMaximo];
        //Contadores
        int ninjasCadastrados = 0;
        int opcao = 0;

        while (opcao != 3) {

            // Cadatrar os nijas em um array e depois mostrar opcoes com switch case
            System.out.println("\n====== Menu Ninja ======");
            System.out.println("1. cadastrar Ninja");
            System.out.println("2. Listar Ninja");
            System.out.println("3. Sair");
            System.out.print("Escolha uma opcao: ");
            
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consumir quebra de linha

            switch (opcao) {
                case 1:
                    if (ninjasCadastrados < numeroMaximo) {
                        System.out.println("Digite o nome ninja cadastrado: ");
                        String nomeNinja = scanner.nextLine();
                        ninjas[ninjasCadastrados] = nomeNinja;
                        ninjasCadastrados++;
                        System.out.println("Ninja cadastrado com sucesso!");
                    } else {
                        System.out.println("Limite de ninjas cadastrados atingido!");
                    }
                    break;

                case 2:
                    if (ninjasCadastrados == 0) {
                        System.out.println("Nenhum ninja cadastrado!");
                    } else {
                        System.out.println("======== Lista de ninjas ========");
                        for (int i = 0; i < ninjasCadastrados; i++) {
                            System.out.println((i + 1) + ". " + ninjas[i]);
                        }
                    }
                    break;
                case 3:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opcao invalida. Tente novamente.");
                    break;
            }
        }
        scanner.close();
    }
}

//observação teremos que tratar erros