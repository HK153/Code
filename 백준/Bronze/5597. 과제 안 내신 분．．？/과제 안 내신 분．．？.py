done = []

for i in range(28):
    done.append(int(input()))

done.sort()
j = 0
for i in range(1,31):
    if j < 28 and i == done[j]:
        j += 1
    else:
        print(i)

    