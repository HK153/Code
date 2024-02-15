def solution(arr):
    stack = []
    for a in arr:
        if not stack:  # 스택이 비어있는 경우
            stack.append(a)
        elif stack[-1] != a:  # 스택의 마지막 요소와 현재 요소가 다른 경우
            stack.append(a)
    
    # 스택에 남은 요소가 정답
    return stack