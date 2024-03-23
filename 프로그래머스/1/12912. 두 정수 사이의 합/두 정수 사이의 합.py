def solution(a, b):
    minNum = min(a, b);
    maxNum = max(a, b);
    # 등차수열의 합
    answer = ((maxNum + minNum) * (maxNum - minNum + 1)) / 2
    return answer