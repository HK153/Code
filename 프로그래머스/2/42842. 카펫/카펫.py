def solution(brown, yellow):
    total = brown + yellow  
    for x in range(total, 2, -1):  # 가로 길이 x를 전체 격자 수부터 시작하여 감소시키며 탐색
        if total % x == 0:  # x가 전체 격자 수의 약수일 경우
            y = total // x  # 세로 길이 y를 계산
            if (x-2) * (y-2) == yellow:  # 노란색 격자의 수가 조건을 만족하는지 확인
                return [x, y]  # 조건을 만족하는 가로, 세로 길이 반환