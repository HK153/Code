def solution(s):
    words = s.split(' ') 
    jaden_case_words = []
    
    for word in words:
        # 빈 문자열이 아닐 때만 처리
        if len(word) > 0:  
            # 첫 문자는 대문자, 그 외는 소문자
            # 공백인 경우 그대로 추가
            jaden_case_words.append(word[0].upper() + word[1:].lower())
        else:
            jaden_case_words.append('')
            
    # 공백을 기준으로 단어 합침
    return ' '.join(jaden_case_words)
