#include <iostream>
using namespace std;

void exibirMenu(){
    cout << "=== MENU ===\n";
    cout << "1 - Cadastrar produto\n";
    cout << "2 - Listar produtos\n";
    cout << "3 - Sair\n";
}

int main(){
    int opcao;

    while(true){
        exibirMenu();
        cin >> opcao;

        if(opcao == 3){
            break;
        }
    }
}