#include <iostream>
using namespace std;

int main() {
    string nomes[3];
    int qtd[3];

    for(int i = 0; i < 3; i++){
        cout << "Produto: ";
        cin >> nomes[i];

        cout << "Quantidade: ";
        cin >> qtd[i];
    }

    cout << "\nRELATORIO:\n";

    for(int i = 0; i < 3; i++){
        if(qtd[i] < 5){
            cout << nomes[i] << " | " << qtd[i] << " [REPOSICAO NECESSARIA]\n";
        } else {
            cout << nomes[i] << " | " << qtd[i] << endl;
        }
    }

    return 0;
}