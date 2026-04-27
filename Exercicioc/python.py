class Aluno:
    def __init__(self, nome, idade, nota):
        self.nome = nome
        self.idade = idade
        self.nota = nota

    def mostrar_dados(self):
        print("Nome:", self.nome)
        print("Idade:", self.idade)
        print("Nota:", self.nota)
        print("-------------------")

# Criando objetos
a1 = Aluno("Julia", 20, 8.5)
a2 = Aluno("Carlos", 22, 5.0)
a3 = Aluno("Ana", 19, 9.0)

a1.mostrar_dados()
a2.mostrar_dados()
a3.mostrar_dados()