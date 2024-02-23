def solution(n):
    # 10진수를 3진수로 변환
    a = ''
    while n:
        n, mod = divmod(n, 3)
        a = str(mod) + a
    
    # 3진수를 뒤집음
    a_reversed = a[::-1]

    # 뒤집힌 3진수를 다시 10진수로 변환
    answer = int(a_reversed, 3)
    
    return answer