nota = int(input("Nota: "))

if nota >= 90:
    print("A")
elif nota >= 80:
    print("B")
elif nota >= 70:
    print("C")
elif nota >= 60:
    print("D")
else:
    print("E")

def classificar(nota):
    if nota >= 90: return "A"
    elif nota >= 80: return "B"
    elif nota >= 70: return "C"
    elif nota >= 60: return "D"
    else: return "E"

print(classificar(nota))