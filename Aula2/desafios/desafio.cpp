#include <iostream>
using namespace std;

int main() {
    string nome;
    int quantidade;
    float preco;

    cout << "Produto: ";
    cin >> nome;

    cout << "Quantidade: ";
    cin >> quantidade;

    cout << "Preço: ";
    cin >> preco;

    if (quantidade >= 0) {
        cout << "Produto: " << nome << endl;
        cout << "Quantidade: " << quantidade << endl;
        cout << "Preço: " << preco << endl;
    } else {
        cout << "Erro: quantidade não pode ser negativa!" << endl;
    }

    return 0;
}