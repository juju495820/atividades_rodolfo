#include <iostream> // bliblioteca parab entrada e saida de dados//
#include <iomanip> //para fatorar as casas decimais 
using namespace std;

int main() {
    int numero1 = 0, numero2 =0, soma, subtracao , multiplicacao;
    float divisao;

    cout << "Digite o primeiro numero:"; cin >> numero1;
    cout << " Digite o segundo numero"; cin >> numero2;

    soma = numero1 + numero2;
    subtracao = numero1 - numero2;
    multiplicacao = numero1 * numero2;
    divisao = numero1 / numero2;

    cout << fixed << setprecision(2);
    cout << "soma:"<< soma << end1;
    cout << "subtracao:"<< subtracao << end1;
    cout << "multiplicacao:"<< multiplicacao << end1;
    cout << "divisao:"<< divisao << end1;

    return 0;
    
}
