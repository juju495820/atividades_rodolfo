class Insumo:

    # Passo 1: Estrutura do Insumo
    def __init__(self, nome, quantidade, mes_validade):

        self.__nome = nome
        self.__quantidade = quantidade
        self.__mes_validade = 1

        # Usa o método validador
        self.set_mes_validade(mes_validade)

    # Passo 2: Filtro de Sanidade
    def set_mes_validade(self, mes):

        if 1 <= mes <= 12:
            self.__mes_validade = mes
            print(f"Mês de validade atualizado para {mes}")

        else:
            print("ERRO: mês inválido! Digite um valor entre 1 e 12.")

    # Passo 3: Trava de Segurança Final
    def esta_valido(self, mes_atual):

        return self.__mes_validade >= mes_atual

    # Método extra para mostrar dados
    def mostrar_dados(self):

        print(f"Insumo: {self.__nome}")
        print(f"Quantidade: {self.__quantidade}")
        print(f"Mês de validade: {self.__mes_validade}")


# TESTES

amendoim = Insumo("Amendoim", 50, 10)

print("\n--- Dados do Produto ---")
amendoim.mostrar_dados()

print("\n--- Testando Validade ---")
print(amendoim.esta_valido(8))   # True
print(amendoim.esta_valido(11))  # False

print("\n--- Testando erro ---")
amendoim.set_mes_validade(13)