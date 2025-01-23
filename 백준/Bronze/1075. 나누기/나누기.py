N = input()
F = int(input())

N = int(N[:-2] + '00')
answer = 0
while True:
	if N % F == 0:
		print(str(answer).zfill(2))
		break
	else:
		N += 1
		answer += 1 
