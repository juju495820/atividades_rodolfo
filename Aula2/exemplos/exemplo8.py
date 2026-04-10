#Imprimindo - Formatação de strings de forma mais complexa
formatter = "{} {} {} {}"

print(formatter.format(1, 2, 3, 4))
print(formatter.format("one", "two", "three", "four"))
print(formatter.format(True, False, False, True))
print(formatter.format(formatter, formatter, formatter, formatter))
print(formatter.format(
    "Try you",
    "Own text here",
    "MAybe a poem",
    "Or a song about fear"
))
