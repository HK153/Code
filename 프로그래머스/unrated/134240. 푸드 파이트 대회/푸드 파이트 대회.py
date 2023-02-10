def solution(food):
    num = []
    a = []
        
    for i in range(1, len(food)):
        num.append(food[i]//2)
        a.append(str(i)*num[i-1])
        
    answer = ''.join(s for s in a) + '0' + ''.join(s for s in list(reversed(a)))
    
    return answer