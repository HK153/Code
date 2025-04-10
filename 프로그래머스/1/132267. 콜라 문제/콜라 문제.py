def solution(a, b, n):
    answer = 0

    while n >= a:
        # 마트에 병 주고 받은 콜라 수
        answer += (n // a) * b
        # 남은 병 개수 = 교환하고 남은 병 + 새로 받은 병
        n = (n % a) + (n // a) * b

    return answer