
// usando a estrutura if else else-if
import java.util.Scanner;

public class Main {
    public static void main(string[]args){
        System.out.print("Digite a quantidade em estouqeu:");
        int quantidade = scanner.nextInt();


        //Usando a estrutura 'if'
        if (quantidade < 1){
            System.out.println("Status: Em falta");
        }else if (quantidade < 5){
            System.out.println("Status: Alerta de estoque baixo");
        }
        else{
            System.out.println("Status: Estoque OK")
        }
        scanner.close();
        }    }
}
