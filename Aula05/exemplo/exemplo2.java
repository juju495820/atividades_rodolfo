import java.util.Scanner;

public class exemplo2 {

    public static void calcularMedia(double n1, double n2) {
        double media = (n1 + n2) / 2;
        System.out.println("Média: " + media);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        double n1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        while (!sc.hasNextDouble()) {
            System.out.print("Digite um número válido: ");
            sc.next();
        }
        double n2 = sc.nextDouble();

        calcularMedia(n1, n2);

        sc.close();
    }
}