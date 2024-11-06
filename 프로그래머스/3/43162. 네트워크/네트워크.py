def solution(n, computers):
    def dfs(node, visited):
        visited[node] = True
        for i in range(n):
            if computers[node][i] == 1 and not visited[i]:
                dfs(i, visited)

    visited = [False] * n
    answer = 0

    for i in range(n):
        if not visited[i]:  # 방문하지 않은 컴퓨터 발견 시
            dfs(i, visited)
            answer += 1

    return answer