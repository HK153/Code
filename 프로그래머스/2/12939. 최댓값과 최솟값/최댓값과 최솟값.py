def solution(s):
    numbers = list(map(int, s.split()))
    
    # 최소값과 최대값 찾기
    min_num = min(numbers)
    max_num = max(numbers)
    
    # 최소값과 최대값을 문자열로 반환
    answer = f"{min_num} {max_num}"
    return answer