import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] A = new int[15];
        int[] B = new int[15];

        // Leitura dos valores
        for (int i = 0; i < 15; i++) {
            System.out.print("A[" + i + "]: ");
            while (!sc.hasNextInt()) { // valida entrada
                System.out.print("Digite um número válido: ");
                sc.next();
            }
            A[i] = sc.nextInt();
        }

        // Cálculo dos quadrados
        for (int i = 0; i < 15; i++) {
            B[i] = A[i] * A[i];
        }

        // Exibição do vetor A
        System.out.print("\nVetor A: ");
        for (int x : A) {
            System.out.print(x + " ");
        }

        // Exibição do vetor B
        System.out.print("\nVetor B (quadrados): ");
        for (int x : B) {
            System.out.print(x + " ");
        }

        System.out.println(); // quebra de linha final
        sc.close();
    }
}