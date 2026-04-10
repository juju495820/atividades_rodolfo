import java.util.Scanner;

public class desviosimples {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade: ");
        int quantidade = sc.nextInt();

        if (quantidade < 5) {
            System.out.println("Alerta: estoque baixo!");
        }

        sc.close();
    }
}