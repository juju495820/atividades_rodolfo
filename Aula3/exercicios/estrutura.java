import java.util.Scanner;

public class estrutura {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escolha uma opção:");
        System.out.println("1 - If simples");
        System.out.println("2 - If / Else");
        System.out.println("3 - If / Else If");
        System.out.println("4 - Switch");
        int opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            if (quantidade < 5) {
                System.out.println("AVISO: Estoque baixo!");
            }

        } else if (opcao == 2) {
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            if (quantidade < 5) {
                System.out.println("AVISO: Estoque baixo!");
            } else {
                System.out.println("ESTOQUE OK");
            }

        } else if (opcao == 3) {
            System.out.print("Digite a quantidade em estoque: ");
            int quantidade = scanner.nextInt();

            if (quantidade < 1) {
                System.out.println("Status: Em falta");
            } else if (quantidade < 5) {
                System.out.println("Status: Alerta de estoque baixo");
            } else {
                System.out.println("Status: Estoque OK");
            }

        } else if (opcao == 4) {
            System.out.print("Digite o código (1-Disponível, 2-Reposição, 3-Descontinuado): ");
            int codigo_status = scanner.nextInt();

            switch (codigo_status) {
                case 1:
                    System.out.println("Status: Disponível");
                    break;
                case 2:
                    System.out.println("Status: Em reposição");
                    break;
                case 3:
                    System.out.println("Status: Descontinuado");
                    break;
                default:
                    System.out.println("Código inválido");
            }

        } else {
            System.out.println("Opção inválida");
        }

        scanner.close();
    }
}