try:
    produto = input("Digite o nome do produto: ")

    quantidade = int(input("Digite a quantidade do produto: "))

    print("Produto cadastrado com sucesso!")
    print("Produto:", produto)
    print("Quantidade:", quantidade)

except ValueError:
    print("Erro: Digite apenas números na quantidade.")