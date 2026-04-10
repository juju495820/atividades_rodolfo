import java.util.Scanner;

public class exemplo {

    public static void exibirMenu() {
        System.out.println("=== MENU ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Sair");
        System.out.print("Escolha uma opção: ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcao;

        while (true) {
            exibirMenu();
            opcao = sc.nextInt();

            if (opcao == 1) {
                System.out.println("Produto cadastrado!");
            } else if (opcao == 2) {
                System.out.println("Listando produtos...");
            } else if (opcao == 3) {
                System.out.println("Saindo do sistema...");
                break;
            } else {
                System.out.println("Opção inválida!");
            }

            System.out.println(); // linha em branco pra organizar
        }

        sc.close();
    }
}