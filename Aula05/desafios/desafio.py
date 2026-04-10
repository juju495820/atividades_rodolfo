def exibir_cabecalho():
    print("=== SORVETERIA DO DENER ===")

def verificar_estoque(qtd):
    if qtd < 5:
        return "[REPOSIÇÃO NECESSÁRIA]"
    return ""

nomes = []
qtds = []

exibir_cabecalho()

for i in range(3):
    nomes.append(input("Produto: "))
    qtds.append(int(input("Quantidade: ")))

print("\nRELATÓRIO:")

for i in range(3):
    aviso = verificar_estoque(qtds[i])
    print(f"{nomes[i]} | {qtds[i]} {aviso}")