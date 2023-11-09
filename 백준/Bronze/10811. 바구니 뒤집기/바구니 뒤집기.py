N, M = map(int, input().split())
basket = []
for i in range(N):
    basket.append(i+1)

for i in range(M):
    first, end = map(int, input().split())
    first -= 1
    end -= 1
    basket[first:end+1] = reversed(basket[first:end+1])
    
for i in basket:
    print(i)
        