import java.util.Scanner;

public class desafio01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Produto: ");
        String nome = sc.nextLine();

        System.out.print("Quantidade: ");
        while (!sc.hasNextInt()) {
            System.out.print("Digite um número inteiro válido: ");
            sc.next();
        }
        int quantidade = sc.nextInt();

        System.out.print("Preço: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Digite um valor válido: ");
            sc.next();
        }
        double preco = sc.nextDouble();

        if (quantidade >= 0) {
            System.out.println("\n--- DADOS DO PRODUTO ---");
            System.out.println("Produto: " + nome);
            System.out.println("Quantidade: " + quantidade);
            System.out.printf("Preço: R$ %.2f%n", preco);
        } else {
            System.out.println("Erro: quantidade não pode ser negativa!");
        }

        sc.close();
    }
}