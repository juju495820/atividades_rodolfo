#include <iostream>
using namespace std;

void calcularMedia(double n1, double n2){
    double media = (n1 + n2) / 2;
    cout << "Media: " << media;
}

int main(){
    double n1, n2;
    cin >> n1 >> n2;

    calcularMedia(n1, n2);
}