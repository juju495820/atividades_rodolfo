try:

    arquivo = open("dados_financeiros.json", "r")

    conteudo = arquivo.read()

    print(conteudo)

    arquivo.close()

except FileNotFoundError:

    print("Arquivo não encontrado.")

    with open("dados_financeiros.json", "a") as arquivo:

        arquivo.write("{ }\n")

        print("Arquivo criado automaticamente.")