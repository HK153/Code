t = int(input())

for i in range(t):
    n = int(input())
    s = ""
    
    for j in range(n//5):
        s += "++++ "
    for k in range(n%5):
        s += "|"
    print(s)