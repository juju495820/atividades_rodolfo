public class Insumo {

    // Passo 1: Estrutura do Insumo

    private String nome;
    private int quantidade;
    private int mesValidade;

    public Insumo(String nome, int quantidade, int mesValidade) {

        this.nome = nome;
        this.quantidade = quantidade;

        // valor padrão
        this.mesValidade = 1;

        // usa o método validador
        setMesValidade(mesValidade);
    }

    // Passo 2: Filtro de Sanidade

    public void setMesValidade(int mes) {

        if (mes >= 1 && mes <= 12) {

            this.mesValidade = mes;

            System.out.println(
                "Mês de validade atualizado para " + mes
            );

        } else {

            System.out.println(
                "ERRO: mês inválido! Digite um valor entre 1 e 12."
            );
        }
    }

    // Passo 3: Trava de Segurança Final

    public boolean estaValido(int mesAtual) {

        return this.mesValidade >= mesAtual;
    }

    // Método extra para mostrar dados

    public void mostrarDados() {

        System.out.println("Insumo: " + this.nome);
        System.out.println("Quantidade: " + this.quantidade);
        System.out.println("Mês de validade: " + this.mesValidade);
    }
}