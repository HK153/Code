def solution(babbling):
    answer = 0
    words = ["aya", "ye", "woo", "ma"]
    
    for bab in babbling:
        for i, word in enumerate(words):
            bab = bab.replace(word, str(i + 1))
        
        temp = '0'
        check = True
        
        for char in bab:
            if char.isdigit():
                if char == temp:
                    check = False
                    break
                else:
                    temp = char
            else:
                check = False
                break
        
        if check:
            answer += 1

    return answer