def solution(s):
    if s.isdigit():
        if len(s) in [4, 6]:
            return True
        else:
            return False
    else:
        return False
    
