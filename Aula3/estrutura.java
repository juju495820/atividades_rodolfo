import java.util.Scanner;

public class Main {
    public static void main(string[]args){
        System.out.print("Digite a quantidade em estouqeu:");
        int quantidade = scanner.nextInt();


        //Usando a estrutura 'if'
        if (quantidade < 5){
            System.out.println("AVISO: O estoque deste produto está baixo!");
        }
        scanner.close();
        }    }
}


// usando a estrutura com senão
import java.util.Scanner;

public class Main {
    public static void main(string[]args){
        System.out.print("Digite a quantidade em estouqeu:");
        int quantidade = scanner.nextInt();


        //Usando a estrutura 'if'
        if (quantidade < 5){
            System.out.println("AVISO: O estoque deste produto está baixo!");
        }else{
            System.out.println("ESTOQUE OK");
        }
        scanner.close();
        }    }
}

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

// switch


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o código de status (1-Disponível, 2=Reposição, 3=Descontinuado):");
        int codigo_status = scanner.nextInt();

        switch (codigo_status) {
            case 1:
                System.out.printIn("Status: Disponível");
                break;
            case 2: 
                System.out.PrintIn("Status: Em reposição");
                break;
            case 3:
                System.out.PrintIn("Status: Descontinuado");
                break;
            default:
                System.out.PrintIn("Código de status inválido");
        }
        scanner.close();
    }