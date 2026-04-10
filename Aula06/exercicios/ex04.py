nome = input("Nome: ")
idade = int(input("Idade: "))
print(f"Olá {nome}, você tem {idade} anos!")

# Versão 2
def mensagem(nome, idade):
    return f"Olá {nome}, você tem {idade} anos!"

print(mensagem(nome, idade))