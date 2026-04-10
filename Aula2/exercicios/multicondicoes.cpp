#include <iostream>
using namespace std;

int main() {
    int quantidade = 2;

    if (quantidade < 1) {
        cout << "Em falta" << endl;
    } else if (quantidade < 5) {
        cout << "Alerta" << endl;
    } else {
        cout << "OK" << endl;
    }

    return 0;
}