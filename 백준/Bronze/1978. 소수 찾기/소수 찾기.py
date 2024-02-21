import math

N = int(input())
numbers = [int(i) for i in input().split()]
prime = True
answer = 0
for i in numbers:
	if i == 1:
		continue
	for j in range(2, int(math.sqrt(i)) + 1):
		if i % j ==0:
			prime = False
			break
	if prime :
		answer += 1
	prime = True

print(answer)