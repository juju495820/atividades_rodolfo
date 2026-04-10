#include <iostream>
#include <string>
#include <cctype>
using namespace std;

int contarVogais(string texto){
    int cont = 0;

    for(char c : texto){
        c = tolower(c);
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
            cont++;
    }

    return cont;
}

int main(){
    string texto;
    cin >> texto;
    cout << contarVogais(texto) << endl;
}