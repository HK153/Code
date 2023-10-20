N = int(input())
arr = [1,2,3]
for i in range(N):
    a, b = map(int, input().split())
    aIndex = arr.index(a)
    bIndex = arr.index(b)
    arr[aIndex] = b
    arr[bIndex] = a
    
print(arr[0])