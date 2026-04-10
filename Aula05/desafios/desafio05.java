import java.util.Scanner;

public class desafio05 {

    public static void exibirCabecalho() {
        System.out.println("=== SORVETERIA DO DENER ===");
    }

    public static String verificarEstoque(int qtd) {
        if (qtd < 5) {
            return "[REPOSIÇÃO NECESSÁRIA]";
        }
        return "";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 3;
        String[] nomes = new String[n];
        int[] qtds = new int[n];

        exibirCabecalho();

        for (int i = 0; i < n; i++) {

            System.out.print("Produto: ");
            nomes[i] = sc.nextLine(); // permite nome com espaço

            System.out.print("Quantidade: ");
            while (!sc.hasNextInt()) { // valida entrada
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            qtds[i] = sc.nextInt();
            sc.nextLine(); // limpa ENTER
        }

        System.out.println("\nRELATÓRIO:");

        for (int i = 0; i < n; i++) {
            String aviso = verificarEstoque(qtds[i]);
            System.out.println(nomes[i] + " | " + qtds[i] + " " + aviso);
        }

        sc.close();
    }
}