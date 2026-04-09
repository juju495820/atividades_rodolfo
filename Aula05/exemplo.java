import java.util.Scanner;

public class Menu {
    public static void exibirMenu(){
        System.out.println("=== MENU ===");
        System.out.println("1 - Cadastrar produto");
        System.out.println("2 - Listar produtos");
        System.out.println("3 - Sair");
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcao;

        while(true){
            exibirMenu();
            opcao = sc.nextInt();

            if(opcao == 3){
                break;
            }
        }
    }
}