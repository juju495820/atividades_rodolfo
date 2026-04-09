import java.util.Scanner;

public class MVP {
    public static void exibirCabecalho(){
        System.out.println("=== SORVETERIA DO DENER ===");
    }

    public static String verificarEstoque(int qtd){
        if(qtd < 5){
            return "[REPOSIÇÃO NECESSÁRIA]";
        }
        return "";
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String[] nomes = new String[3];
        int[] qtds = new int[3];

        exibirCabecalho();

        for(int i = 0; i < 3; i++){
            System.out.print("Produto: ");
            nomes[i] = sc.next();

            System.out.print("Quantidade: ");
            qtds[i] = sc.nextInt();
        }

        System.out.println("\nRELATÓRIO:");

        for(int i = 0; i < 3; i++){
            String aviso = verificarEstoque(qtds[i]);
            System.out.println(nomes[i] + " | " + qtds[i] + " " + aviso);
        }
    }
}