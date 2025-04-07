def solution(n, m, section):
    paint_count = 0
    current_index = 0

    while current_index < len(section):
        # 현재 페인트칠 시작 위치
        start_position = section[current_index]

        # 칠할 수 있는 마지막 위치
        end_position = start_position + m - 1

        # 롤러사용 카운트 증가
        paint_count += 1

        # 롤러가 덮을 수 있는 범위 내 다음 페인트칠할 구역 찾기
        while current_index < len(section) and section[current_index] <= end_position:
            current_index += 1

    return paint_count