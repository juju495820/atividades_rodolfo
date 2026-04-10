#include <iostream>
using namespace std;

void verificarParidade(int num){
    if(num % 2 == 0)
        cout << "Par" << endl;
    else
        cout << "Impar" << endl;
}

int main(){
    int num;
    cin >> num;
    verificarParidade(num);
}