#include <iostream>
using namespace std;

void exibirCabecalho(){
    cout << "=== SORVETERIA DO DENER ===\n";
}

string verificarEstoque(int qtd){
    if(qtd < 5){
        return "[REPOSICAO NECESSARIA]";
    }
    return "";
}

int main(){
    string nomes[3];
    int qtds[3];

    exibirCabecalho();

    for(int i = 0; i < 3; i++){
        cout << "Produto: ";
        cin >> nomes[i];

        cout << "Quantidade: ";
        cin >> qtds[i];
    }

    cout << "\nRELATORIO:\n";

    for(int i = 0; i < 3; i++){
        cout << nomes[i] << " | " << qtds[i] << " " 
             << verificarEstoque(qtds[i]) << endl;
    }

    return 0;
}