def solution(n):
    answer = n+1
    count_one = bin(n).count('1')
    while True:
        if bin(answer).count('1') == count_one:
            return answer
        answer += 1
   