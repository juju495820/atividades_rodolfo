#include <iostream>
using namespace std;

string classificarTriangulo(int a, int b, int c){
    if(a == b && b == c)
        return "Equilatero";
    else if(a == b || a == c || b == c)
        return "Isosceles";
    else
        return "Escaleno";
}

int main(){
    int a, b, c;
    cin >> a >> b >> c;
    cout << classificarTriangulo(a, b, c) << endl;
}