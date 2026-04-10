#include <iostream>
using namespace std;

double calcularArea(double base, double altura){
    return base * altura;
}

int main(){
    double base, altura;
    cin >> base >> altura;
    cout << calcularArea(base, altura) << endl;
}