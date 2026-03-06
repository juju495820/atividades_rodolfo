
// usando a estrutura if else-if
#include <iostream>
using namespace std;

int main(){
    string produto;
    cout << "Digite a quantidade em produto:";
    cin >> produto;
    
    int quantidade_estoque;
    cout << "Digite a quantidade do estoque:";
    cin >> quantidade_estoque;

    float preco_unitario;
    cout << "Digite a quantidade do estoque:";
    cin >> preco_unitario;




    if (quantidade_estoque < 1){
        cout << "Status: Em falta.!" << endl;

    } else if (quantidade_estoque < 5 ){
        cout << "Status: Alerta de estoque baixo" << endl;
    }
    else{
        cout << "Status: Estoque OK"  << endl;
    }
    return 0;
}
