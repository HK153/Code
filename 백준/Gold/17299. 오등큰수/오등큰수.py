import sys
from collections import Counter

# 입력
input = sys.stdin.read
data = input().split()

N = int(data[0])
A = list(map(int, data[1:]))

# 각 원소의 등장 횟수 계산
freq = Counter(A)

# 결과 저장 리스트 (-1로 초기화)
result = [-1] * N

stack = []

for i in range(N):
    # 스택이 비어있지 않고, 현재 원소의 등장 횟수가 스택 최상단 원소의 등장 횟수보다 크면
    while stack and freq[A[stack[-1]]] < freq[A[i]]:
        result[stack.pop()] = A[i]
    
    # 현재 인덱스를 스택에 추가
    stack.append(i)

# 결과
print(" ".join(map(str, result)))