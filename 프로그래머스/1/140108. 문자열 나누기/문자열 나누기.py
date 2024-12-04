def solution(s):
    answer = 0
    i = 0
    
    while i < len(s):
        x = s[i]  # 첫 번째 글자
        x_count = 0  # x의 개수
        other_count = 0  # x가 아닌 글자의 개수
        
        # 문자열을 읽으면서 x와 x가 아닌 글자의 개수를 센다
        for j in range(i, len(s)):
            if s[j] == x:
                x_count += 1
            else:
                other_count += 1
            
            # 두 횟수가 같아지는 순간 분리
            if x_count == other_count:
                i = j + 1
                break
        else:
            # 더 이상 읽을 글자가 없을 경우 분리
            i = len(s)
        
        answer += 1 
    return answer