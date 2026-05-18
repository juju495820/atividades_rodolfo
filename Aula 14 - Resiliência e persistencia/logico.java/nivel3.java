import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Nivel3 {

    public static void main(String[] args) {

        try {

            File arquivo = new File("dados_financeiros.json");

            Scanner leitor = new Scanner(arquivo);

            while(leitor.hasNextLine()) {

                System.out.println(leitor.nextLine());

            }

            leitor.close();

        }

        catch(IOException erro) {

            System.out.println("Arquivo não encontrado.");

            try {

                FileWriter arquivoNovo = new FileWriter("dados_financeiros.json");

                arquivoNovo.write("{ }\n");

                arquivoNovo.close();

                System.out.println("Arquivo criado automaticamente.");

            }

            catch(IOException e) {

                System.out.println("Erro ao criar arquivo.");

            }

        }

    }
}