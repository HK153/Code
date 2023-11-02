N = int(input())
member = {}

for i in range(N):
    age, name = input().split()
    age = int(age)
    if age in member:
        member[age].append(name)
    else:
        member[age] = [name]

sorted_ages = sorted(member.keys())

for age in sorted_ages:
    for name in member[age]:
        print(age, name)