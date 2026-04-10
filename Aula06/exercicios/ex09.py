texto = input()
cont = 0

for c in texto.lower():
    if c in "aeiou":
        cont += 1

print(cont)


def contar(texto):
    return sum(1 for c in texto.lower() if c in "aeiou")

print(contar(texto))