T = int(input())
coins = [25, 10, 5, 1]

for i in range(T):
    answer = []
    C = int(input())
    for coin in coins:
        if C >= coin:
            answer.append(C // coin)
            C %= coin
        else:
            answer.append(0)
    
    print(*answer)