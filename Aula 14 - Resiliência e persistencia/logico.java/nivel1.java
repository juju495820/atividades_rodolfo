import java.util.Scanner;

public class Nivel1 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        try {

            String produto;
            int quantidade;

            System.out.print("Digite o nome do produto: ");
            produto = entrada.nextLine();

            System.out.print("Digite a quantidade: ");
            quantidade = Integer.parseInt(entrada.nextLine());

            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("Produto: " + produto);
            System.out.println("Quantidade: " + quantidade);

        }

        catch(NumberFormatException erro) {

            System.out.println("Erro: Digite apenas números na quantidade.");

        }

    }
}