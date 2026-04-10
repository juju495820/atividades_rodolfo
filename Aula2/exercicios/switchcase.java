public class switchcase {
    public static void main(String[] args) {

        int codigo = 2;

        switch (codigo) {
            case 1:
                System.out.println("Disponível");
                break;
            case 2:
                System.out.println("Em reposição");
                break;
            case 3:
                System.out.println("Descontinuado");
                break;
            default:
                System.out.println("Código inválido");
        }
    }
}