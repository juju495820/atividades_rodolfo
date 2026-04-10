#include <iostream>
using namespace std;

double aplicarDesconto(double valor, double desc){
    return valor - (valor * desc/100);
}

int main(){
    double valor, desc;
    cin >> valor >> desc;
    cout << aplicarDesconto(valor, desc) << endl;
}