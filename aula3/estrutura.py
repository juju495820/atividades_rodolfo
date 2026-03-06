#Solicitando a quantdade ao úsuario

quantidade = int(input("Digite a quantidade em estoque:"))
#Usando a estrutura 'if'
if quantidade < 5:
    print("AVISO: O estoque deste produto está baixo!")




    # estrutura com o senão

quantidade = int(input("Digite a quantidade em estoque:"))
#Usando a estrutura 'if'
if quantidade < 5:
    print("AVISO: O estoque deste produto está baixo!")
else:
    print("Estoque OK.")

    # estrutura com o if else else-if

quantidade = int(input("Digite a quantidade em estoque:"))
#Usando a estrutura 'if'
if quantidade < 1:
    print("Status: Em falta")
elif quantidade < 5:
    print("Status: Alerta de estoque baixo")
else:
    print("Status: Estoque OK")
