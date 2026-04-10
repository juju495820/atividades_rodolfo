#include <iostream>
using namespace std;

void tabuada(int n){
    for(int i = 1; i <= 10; i++){
        cout << n << " x " << i << " = " << n*i << endl;
    }
}

int main(){
    int n;
    cin >> n;
    tabuada(n);
}