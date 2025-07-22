from collections import defaultdict

def solution(want, number, discount):
    answer = 0

    for i in range(len(discount) - 9):
        hm = defaultdict(int)
        for j in range(i, i + 10):
            hm[discount[j]] += 1

        check = True
        for k in range(len(want)):
            if hm[want[k]] < number[k]:
                check = False
                break

        if check:
            answer += 1

    return answer