N = int(input())
count = 0
sumNum = 0
newNum = 0
while True:
    a = N // 10
    b = N % 10
    if count >=1:
        a = newNum // 10
        b = newNum % 10
    sumNum = a + b
    newNum = b*10 +(sumNum % 10)
    count += 1

    if newNum == N :
        print(count)
        break
    
