import java.util.Scanner; //clasee para leitura de dados 
import java.util.Locale; //para grantir  o uso de ponto decimal em vez de virgula

public class calculadors {

    public static void main(string[] args){

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        System.out.printin(x:"---Clculadora de Negocios (Java) ---");

        System.out.print(s:"Digite o primeiro número:");
        double numero1 = sc.nestDouble();

        System.out.print(s:"Digite o segundo número:");
        double numero2 = sc.nestDouble();

        double soma = numero1 + numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;
        double divisao = numero1 / numero2;

        System.out.printf(format: "Soma: %.2f%n", soma);
        System.out.printf(format: "Subtração: %.2f%n", subtracao);
        System.out.printf(format: "Multiplicação: %.2f%n", Multiplicacao);
        System.out.printf(format: "Divisão: %.2f%n", divisao);

        sc.close();







    }
}