num = input()

num_str = list(num)

num_str.sort(reverse=True)
print(''.join(num_str))