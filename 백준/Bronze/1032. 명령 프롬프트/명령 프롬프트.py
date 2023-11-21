N = int(input())
word = list(input())

for i in range(N - 1):
    s = input()
    for j in range(len(word)):
        if word[j] != s[j]:
            word[j] = '?'

print(''.join(word))