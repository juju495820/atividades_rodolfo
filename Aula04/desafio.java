import java.util.Scanner;

public class Estoque {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] qtd = new int[3];

        for(int i = 0; i < 3; i++){
            System.out.print("Produto: ");
            nomes[i] = sc.next();

            System.out.print("Quantidade: ");
            qtd[i] = sc.nextInt();
        }

        System.out.println("\nRELATÓRIO:");

        for(int i = 0; i < 3; i++){
            if(qtd[i] < 5){
                System.out.println(nomes[i] + " | " + qtd[i] + " [REPOSIÇÃO NECESSÁRIA]");
            } else {
                System.out.println(nomes[i] + " | " + qtd[i]);
            }
        }
    }
}