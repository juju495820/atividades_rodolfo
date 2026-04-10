nome = input("Produto: ")
quantidade = int(input("Quantidade: "))
preco = float(input("Preço: "))

if quantidade >= 0:
    print(f"Produto: {nome}")
    print(f"Quantidade: {quantidade}")
    print(f"Preço: {preco}")
else:
    print("Erro: quantidade não pode ser negativa!")