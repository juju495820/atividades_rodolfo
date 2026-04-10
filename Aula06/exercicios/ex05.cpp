#include <iostream>
using namespace std;

double converter(double c){
    return (c * 9/5) + 32;
}

int main(){
    double c;
    cin >> c;
    cout << converter(c) << endl;
}