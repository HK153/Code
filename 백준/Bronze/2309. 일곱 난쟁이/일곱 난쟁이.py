dwarfs = [int(input()) for _ in range(9)]
total = sum(dwarfs)

found = False  # 두 명의 가짜 난쟁이를 찾았는지 여부를 확인

for i in range(9):
    if found:
        break  # 두 명의 가짜 난쟁이를 찾았다면 반복문 종료
    for j in range(i + 1, 9):
        if total - dwarfs[i] - dwarfs[j] == 100:
            fake1, fake2 = dwarfs[i], dwarfs[j]
            dwarfs.remove(fake1)
            dwarfs.remove(fake2)
            dwarfs.sort()
            for dwarf in dwarfs:
                print(dwarf)
            found = True  # 가짜 난쟁이를 찾았으므로 플래그 설정
            break