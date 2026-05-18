import java.io.FileWriter;
import java.io.IOException;

public class Nivel2 {

    public static void main(String[] args) {

        try {

            FileWriter arquivo = new FileWriter("log_sistema.txt");

            arquivo.write("Sistema iniciado com sucesso.");

            arquivo.close();

            System.out.println("Arquivo salvo.");

        }

        catch(IOException erro) {

            System.out.println("Erro ao salvar arquivo.");

        }

        finally {

            System.out.println("Rotina de persistência finalizada, recursos liberados.");

        }

    }
}