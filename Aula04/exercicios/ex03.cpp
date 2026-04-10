//Poder dos quadrados//

#include <iostream>
using namespace std;

int main() {
    int A[15], B[15];

    for(int i = 0; i < 15; i++){
        cout << "A[" << i << "]: ";
        cin >> A[i];
    }

    for(int i = 0; i < 15; i++){
        B[i] = A[i] * A[i];
    }

    cout << "A: ";
    for(int i = 0; i < 15; i++){
        cout << A[i] << " ";
    }

    cout << "\nB: ";
    for(int i = 0; i < 15; i++){
        cout << B[i] << " ";
    }

    return 0;
}