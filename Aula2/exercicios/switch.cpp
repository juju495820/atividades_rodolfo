#include <iostream>
using namespace std;

int main() {
    int codigo = 2;

    switch (codigo) {
        case 1:
            cout << "Disponível" << endl;
            break;
        case 2:
            cout << "Em reposição" << endl;
            break;
        case 3:
            cout << "Descontinuado" << endl;
            break;
        default:
            cout << "Código inválido" << endl;
    }

    return 0;
}