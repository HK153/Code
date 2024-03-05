from itertools import permutations

N, K = map(int, input().split())
kits = list(map(int, input().split()))

answer = 0

for perm in permutations(kits, N):
    weight = 500
    for kit in perm:
        weight += kit - K  
        if weight < 500:  
            break
    else:
        answer += 1


print(answer)