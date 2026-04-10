def exibir_menu():
    print("=== MENU ===")
    print("1 - Cadastrar produto")
    print("2 - Listar produtos")
    print("3 - Sair")

while True:
    exibir_menu()
    opcao = input("Escolha: ")
    
    if opcao == "3":
        break