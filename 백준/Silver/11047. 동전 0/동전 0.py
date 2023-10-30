N, K = map(int, input().split())
coin = []
for i in range(N):
    coin.append(int(input()))

answer = 0

for i in reversed(coin):
    if K >= i:
        answer += K // i
        K = K % i
    elif K == 0:
        break
    else:
        continue

print(answer)
    