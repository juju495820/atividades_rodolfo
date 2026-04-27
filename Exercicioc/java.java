class Aluno {
    String nome;
    int idade;
    double nota;

    void mostrarDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Nota: " + nota);
        System.out.println("-------------------");
    }
}

public class Main {
    public static void main(String[] args) {

        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();

        a1.nome = "Julia";
        a1.idade = 20;
        a1.nota = 8.5;

        a2.nome = "Carlos";
        a2.idade = 22;
        a2.nota = 5.0;

        a3.nome = "Ana";
        a3.idade = 19;
        a3.nota = 9.0;

        a1.mostrarDados();
        a2.mostrarDados();
        a3.mostrarDados();
    }
}