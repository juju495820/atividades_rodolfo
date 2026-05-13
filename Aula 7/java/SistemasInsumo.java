public class SistemaInsumo {

    public static void main(String[] args) {

        Insumo amendoim =
            new Insumo("Amendoim", 50, 10);

        System.out.println("\n--- Dados do Produto ---");

        amendoim.mostrarDados();

        System.out.println("\n--- Testando validade ---");

        System.out.println(
            amendoim.estaValido(8)
        ); // true

        System.out.println(
            amendoim.estaValido(11)
        ); // false

        System.out.println("\n--- Testando erro ---");

        amendoim.setMesValidade(13);
    }
}