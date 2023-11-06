word = input()
answer = 0

i = 0
while i < len(word):
    if word[i:i+2] in ['c=', 'c-', 'd-', 'lj', 'nj', 's=', 'z=']:
        answer += 1
        i += 2
    elif word[i:i+3] == 'dz=':
        answer += 1
        i += 3
    else:
        answer += 1
        i += 1

print(answer)