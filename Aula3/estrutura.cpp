#include <iostream>
using namespace std;

int main(){
    int quantidade;
    cout << "Digite a quantidade em estoque:";
    cin >> quantidade;

    //Usando a estrutura 'if'
    if (quantidade < 5){
        cout << "Aviso: o estoque deste produto está baixo!" << endl;

    }
    return 0;
}

// usando a estrutura senão
#include <iostream>
using namespace std;

int main(){
    int quantidade;
    cout << "Digite a quantidade em estoque:";
    cin >> quantidade;

    //Usando a estrutura 'if'
    if (quantidade < 5){
        cout << "Aviso: o estoque deste produto está baixo!" << endl;

    } else{
        cout << "Estoque OK." << std::endl;
    }
    return 0;
}

// usando a estrutura if else-if
#include <iostream>
using namespace std;

int main(){
    int quantidade;
    cout << "Digite a quantidade em estoque:";
    cin >> quantidade;

    if (quantidade < 1){
        cout << "Status: Em falta.!" << endl;

    } else if (quantidade < 5 ){
        cout << "Status: Alerta de estoque baixo" << endl;
    }
    else{
        cout << "Status: Estoque OK"  << endl;
    }
    return 0;
}

// switch


#include <iostream>
using namespace std;

int main() {
    int codigo_status;
    cout << "Digite o código de status (1 = Disponível, 2 = Reposição, 3 = Descontinuado):";
    cin >> codigo_status;

    switch (codigo_status) {
        case 1: cout << "Status: Disponível." << endl;
            break;
        case 2: cout << "Status: Em Reposição." << endl;
            break;
        case 3: cout << "Status: Descontinuado." << endl;
            break;
        default: cout << "Código de status inválido." << endl;
    }
return 0;
}