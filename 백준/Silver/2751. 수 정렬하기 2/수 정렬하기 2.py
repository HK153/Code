import sys

N = int(sys.stdin.readline())
arr_set = set()

for _ in range(N):
    arr_set.add(int(sys.stdin.readline().strip()))

arr_sorted = sorted(arr_set)

for num in arr_sorted:
    print(num)