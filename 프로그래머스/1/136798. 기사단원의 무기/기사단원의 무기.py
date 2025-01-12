def solution(number, limit, power):
    answer = 0
    for i in range(number):
            cnt = 0
            for j in range(1, int((i + 1)**0.5) + 1):
                if j * j == i + 1:
                    cnt += 1
                elif (i + 1) % j == 0:
                    cnt += 2
            if cnt > limit:
                answer += power
            else:
                answer += cnt
    return answer