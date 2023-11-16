X = int(input())

binary = str(format(X, 'b'))
answer = 0
for i in binary:
    if i =='1':
        answer += 1
print(answer)    