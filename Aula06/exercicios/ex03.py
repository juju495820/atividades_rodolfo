senha = ""
while len(senha) < 8:
    senha = input("Digite a senha: ")

# Versão 2
def validar_senha(senha):
    return len(senha) >= 8

senha = ""
while not validar_senha(senha):
    senha = input("Digite a senha: ")