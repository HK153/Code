n, k = map(int, input().split())

point = list(map(int, input().split()))

point.sort()

print(point[n-k])