import sys
input = sys.stdin.readline
print = sys.stdout.write
N = int(input().rstrip())
q = []
for i in range(N):
    s = input().rstrip().split()
    if s[0] == "push":
        q.append(s[1])
    elif s[0] == "pop":
        if len(q) == 0:
            print("-1" +"\n")
        else:
            print(q.pop(0)+"\n")
    elif s[0] == "size":
        print(str(len(q))+"\n")
    elif s[0] == "empty":
        if len(q) == 0:
            print("1"+"\n")
        else:
            print("0"+"\n")
    elif s[0] == "front":
        if len(q) == 0:
            print("-1"+"\n")
        else:
            print(q[0] +"\n")
    elif s[0] == "back":
        if len(q) == 0:
            print("-1"+"\n")
        else:
            print(q[-1]+"\n")
