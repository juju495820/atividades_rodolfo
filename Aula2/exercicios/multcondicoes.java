public class multcondicoes {
    public static void main(String[] args) {

        int quantidade = 2; // pode mudar o valor para testar

        if (quantidade < 1) {
            System.out.println("Em falta");
        } else if (quantidade < 5) {
            System.out.println("Alerta");
        } else {
            System.out.println("OK");
        }
    }
}