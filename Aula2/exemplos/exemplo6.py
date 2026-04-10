#Strings e Texto - Algumas Variáveis, um pouco complexas
#  e um pouco de trabalho com Strings dentro de strings

#Atribuição de inteiro em variável
type_of_people = 10

#Atribuição de string com variável embutida
x = f"There are {type_of_people} type pf people."

#Atribuição de valor textual a uma variável
binary ="binary"

#Atribuição de valor textual a uma variável
do_not ="don't"

#Atribuição de string com variável embutida
y = f" Those who know {binary} and those who {do_not}"

print(x) #imprime o valor da variável
print(y) #imprime o valor da variável

print(f"I' said: {x}") #impriem um texto com uma variável embutida
print(f"I also said: '{y}") #imprime um texto com uma variável embutida

hilarious = False #criação de variável com valor boleano
joke_evaluetion ="isn't that joke so funny?! {}" #criaçãode variável com texto e espaço 
#para embutir uma variável sem defini-lá

print(joke_evaluetion.format (hilarious)) #uma forma de imprimir a variável textual
#com uma variável embutida,que eu posso escolher

w = "This is left side of..." #criação de variável com valor textual
e = "a string with a rigth side." #criação de variável com valor textual

print(w + e) #concatena os valores textuais armazenado nas variáveis
