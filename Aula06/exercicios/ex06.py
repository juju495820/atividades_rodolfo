valor = float(input("Valor: "))
desc = float(input("Desconto: "))
final = valor - (valor * desc/100)
print(final)

# Versão 2
def aplicar_desconto(valor, desc):
    return valor - (valor * desc/100)

print(aplicar_desconto(valor, desc))