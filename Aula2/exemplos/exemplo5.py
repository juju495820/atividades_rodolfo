#Mais Variáveis e Impressão - Concatenação de variáveis mais texto,uma forma de usar a saída de dados com variáveis

Name = 'Zed A. Shaw'
Age = 35 #não é mentira
Heigth = 74 #polegadas
Weight = 180 #libras
Eyes = 'Blue'
Teeth = 'white'
Hair = 'Brown'

print(f"Let's talk about {Name}.")
print(f"He's {Heigth} inches tall.")
print(f"He's {Weight} pounds heavy.")
print(f"Actualy that's not too heavy.")
print(f"He's got {Eyes} eyes an {Hair} hair.")
print(f"His teeth are usualy {Teeth} depending on the coffe.")

#Essa linha é capciosa, tente escrever exatamente como está 
total = Age + Heigth + Weight
print(f"If i add {Age}, {Heigth} and my {Weight} i get {total}.")