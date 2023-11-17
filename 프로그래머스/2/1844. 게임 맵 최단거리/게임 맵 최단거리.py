from collections import deque

def solution(maps):
    n, m = len(maps), len(maps[0])
    
    # 상하좌우 방향을 나타내는 리스트
    directions = [(-1, 0), (1, 0), (0, -1), (0, 1)]
    
    # BFS를 위한 큐
    queue = deque([(0, 0, 1)])  # 시작 위치 (0, 0), 거리 1
    
    while queue:
        x, y, distance = queue.popleft()
        
        # 현재 위치가 상대 팀 진영에 도착한 경우
        if x == n - 1 and y == m - 1:
            return distance
        
        for dx, dy in directions:
            nx, ny = x + dx, y + dy
            
            # 맵을 벗어나지 않고, 벽이 아니며, 방문하지 않은 경우
            if 0 <= nx < n and 0 <= ny < m and maps[nx][ny] == 1:
                queue.append((nx, ny, distance + 1))
                maps[nx][ny] = 0  # 방문한 위치는 벽으로 바꿔줌 (중복 방문 방지)

    
    # BFS를 마치고도 상대 팀 진영에 도착하지 못한 경우
    return -1