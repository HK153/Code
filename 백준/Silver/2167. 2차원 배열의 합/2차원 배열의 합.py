N, M = map(int, input().split())
#print(N, M)

array = []
for _ in range(N):
    array.append(list(map(int,input().split())))

sum_arr = [[0] * (M+1) for _ in range(N+1)]
for i in range(1,N+1):
    for j in range(1,M+1):
        sum_arr[i][j] = sum_arr[i][j-1] + array[i-1][j-1]

#print(array)
#print(sum_arr)

K = int(input())
for _ in range(K):
    i, j, x, y = map(int, input().split())
    count = 0
    for r in range(i, x+1):
        count += sum_arr[r][y] - sum_arr[r][j-1]
    print(count)