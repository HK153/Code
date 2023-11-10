from collections import Counter

word = input()

count = Counter(word.upper()).most_common(2)
if len(count) == 2 and count[0][1] == count[1][1]:
    print("?")
else:
    print(count[0][0])