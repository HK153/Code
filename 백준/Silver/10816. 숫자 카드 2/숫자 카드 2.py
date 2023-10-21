n = int(input())
dic = {}
cards = list(map(int,input().split()))
for c in cards:
    if c in dic:
        dic[c] = dic.get(c) + 1
    else:
        dic[c] = 1
m = int(input())
numCards = list(map(int,input().split()))
for c in numCards:
    if c in dic:
        print(dic.get(c))
    else:
        print(0)