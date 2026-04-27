#include <iostream>
using namespace std;

class Aluno {
public:
    string nome;
    int idade;
    double nota;

    void mostrarDados() {
        cout << "Nome: " << nome << endl;
        cout << "Idade: " << idade << endl;
        cout << "Nota: " << nota << endl;
        cout << "-------------------" << endl;
    }
};

int main() {
    Aluno a1, a2, a3;

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

    return 0;
}