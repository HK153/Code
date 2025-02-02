import sys
input = sys.stdin.readline

# 입력
N, M = map(int, input().split())
numbers = list(map(int, input().split()))

# 누적 합 배열
prefix_sum = [0]
for num in numbers:
    prefix_sum.append(prefix_sum[-1] + num)

# 구간 합 계산 및 출력
for _ in range(M):
    i, j = map(int, input().split())
    print(prefix_sum[j] - prefix_sum[i - 1])