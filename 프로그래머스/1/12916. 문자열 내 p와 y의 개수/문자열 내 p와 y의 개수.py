def solution(s):
    balance = 0  
    s = s.lower()  

    for char in s:
        if char == 'p':
            balance += 1  
        elif char == 'y':
            balance -= 1   
            
    return balance == 0