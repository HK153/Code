def solution(a, b):
    minNum = min(a, b);
    maxNum = max(a, b);
    answer = ((maxNum + minNum) * (maxNum - minNum + 1)) / 2
    return answer