def solution(s):
    stack = []
    
    for c in s:
        if c == '(':
            stack.append(c)
        elif not stack:
            return False
        else:
            stack.pop()
    
    return not stack