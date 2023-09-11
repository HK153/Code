def solution(arr):
    answer = []
    m = min(arr)
    if len(arr) == 1:
        answer.append(-1)
    else:
        for a in arr:
            if a != m:
                answer.append(a)
                
    return answer