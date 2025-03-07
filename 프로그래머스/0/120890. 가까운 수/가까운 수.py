def solution(array, n):
    array.sort()
    answer = 110
    for a in array:
        if abs(n - a) < abs(n - answer):
            answer = a
        elif abs(n - a) == abs(n - answer) and a != answer:
            return answer
    return answer