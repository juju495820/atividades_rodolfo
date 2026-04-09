#Subtraindo Matrizes#

A = []
B = []
C = []

for i in range(5):
    A.append(float(input("A: ")))
    B.append(float(input("B: ")))
    C.append(A[i] - B[i])

print(C)