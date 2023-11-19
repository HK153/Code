N = int(input())

score = list(map(float, input().split()))
score.sort()
M = score[len(score)-1]
for i in range(len(score)):
    score[i] = float(score[i] / M * 100)

mean = sum(score)/ len(score)

print(mean)
