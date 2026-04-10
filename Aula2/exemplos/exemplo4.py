#Variáveis e Nomes - Como declarar variaveis e seus rótulos

cars = 100 #atribuindo um número inteiro
spaceInACar = 4.0 #atribuindo um número real
drivers = 30 #atribuindo um número inteiro
passengers = 90 #atribuindo um número inteiro
carsNotDriven = cars - drivers #Operação aritmética entre inteiro e inteiro
carsDriven = drivers #atribuição de valor entre variaveis sem operação 
carpoolCapacity = carsDriven * spaceInACar #atribuindo o resultado de uma operação aritmética entre inteiroe real
averagePassengersPerCar = passengers / carsDriven #atribuindo o resultado a uma operção aritmética entre inteiro e inteiro

print("There are",cars, "cars available")
print("There are only",drivers, "drives available")
print("There will be",carsNotDriven, "empty cars today")
print("We can transpot",carpoolCapacity, "people today")
print("We have",passengers, "to carpool today")
print("We need to put about",averagePassengersPerCar, "in each car")
print(10/5)