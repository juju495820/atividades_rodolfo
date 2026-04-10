#include <iostream>
#include <string>
using namespace std;

string mensagem(string nome, int idade){
    return "Ola " + nome + ", voce tem " + to_string(idade) + " anos!";
}

int main(){
    string nome;
    int idade;

    cin >> nome >> idade;
    cout << mensagem(nome, idade) << endl;
}