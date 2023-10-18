N = int(input())

for i in range(N):
    p = ""
    r, s = input().split()
    
    for j in s:
        p += j*int(r)
    
    print(p)