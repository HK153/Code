Y = int(input())
b = 0
if (Y % 4 == 0) and (Y % 100 != 0):
    b = 1
if Y % 400 ==0:
    b = 1

if b:
    print(1)
else:
    print(0)