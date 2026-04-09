// Subtraindo Matrizes//

#include <iostream>
using namespace std;

int main() {
    double A[5], B[5], C[5];

    for(int i = 0; i < 5; i++){
        cout << "A: ";
        cin >> A[i];

        cout << "B: ";
        cin >> B[i];

        C[i] = A[i] - B[i];
    }

    for(int i = 0; i < 5; i++){
        cout << C[i] << " ";
    }

    return 0;
}