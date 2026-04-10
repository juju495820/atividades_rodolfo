#include <iostream>
#include <string>
using namespace std;

bool validarSenha(string senha){
    return senha.length() >= 8;
}

int main(){
    string senha;

    do{
        cin >> senha;
    }while(!validarSenha(senha));

    cout << "Senha válida!" << endl;
}