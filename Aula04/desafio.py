nomes = []
qtd = []

for i in range(3):
    nomes.append(input("Produto: "))
    qtd.append(int(input("Quantidade: ")))

print("\nRELATÓRIO:")

for i in range(3):
    if qtd[i] < 5:
        print(f"{nomes[i]} | {qtd[i]} [REPOSIÇÃO NECESSÁRIA]")
    else:
        print(f"{nomes[i]} | {qtd[i]}")