# 입력 처리
n, c = map(int, input().split())
m = int(input())
deliveries = [tuple(map(int, input().split())) for _ in range(m)]

def solution(n, c, m, deliveries):
    # 도착 마을 기준으로 정렬
    deliveries.sort(key=lambda x: x[1])
    
    # 각 마을에서 트럭에 실린 박스 수
    current_load = [0] * (n + 1)
    
    # 전체 배송된 박스 수
    total_boxes = 0

    for start, end, boxes in deliveries:
        # 현재 구간에서 실을 수 있는 최대 박스 개수 계산
        available_capacity = min(boxes, c - max(current_load[start:end]))
        
        # 박스 실을 수 있는 만큼 실기
        total_boxes += available_capacity
        
        # 트럭 상태 업데이트
        for i in range(start, end):
            current_load[i] += available_capacity
            
    return total_boxes
    
    
print(solution(n, c, m, deliveries))