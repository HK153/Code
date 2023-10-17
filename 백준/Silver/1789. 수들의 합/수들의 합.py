S = int(input())
temp = 0
count = 0
for i in range (1,S+1):
    temp += i
    count += 1
    if temp == S:
        print(count)
        break;
    elif (S - temp) <= i:
        temp -= i
        count -= 1
        continue

        
        
        