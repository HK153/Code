def solution(word):
    answer = 0
    vowels = ['A', 'E', 'I', 'O', 'U']
    
    # 각 자리 수에서 가능한 조합의 수 (5^0 + 5^1 + 5^2 + 5^3 + 5^4)
    factors = [781, 156, 31, 6, 1] # 각 자리의 가중치
    # 각 자리의 알파벳이 가지는 값을 factors와 곱해주고 인덱스를 1부터 시작하기 위해 +1
    for i in range(len(word)):
        answer += vowels.index(word[i]) * factors[i] + 1
    
    return answer