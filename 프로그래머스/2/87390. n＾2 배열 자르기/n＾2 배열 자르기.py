def solution(n, left, right):
    length = right - left + 1
    answer = [0] * length

    for i in range(length):
        num = left + i
        row = num // n
        col = num % n
        answer[i] = max(row + 1, col + 1)

    return answer