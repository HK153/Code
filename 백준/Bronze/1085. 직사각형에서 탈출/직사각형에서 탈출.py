x, y, w, h = map(int, input().split())
d = []
d.append(x)
d.append(y)
d.append(w-x)
d.append(h-y)

d.sort()

print(d[0])


