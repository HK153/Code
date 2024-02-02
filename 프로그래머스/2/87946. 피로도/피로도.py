def solution(k, dungeons):
    def dfs(k, dungeons, visited, cnt):
        max_cnt = cnt
        for i in range(len(dungeons)):
            if not visited[i] and k >= dungeons[i][0]:
                visited[i] = True
                max_cnt = max(max_cnt, dfs(k - dungeons[i][1], dungeons, visited, cnt + 1))
                visited[i] = False
        return max_cnt

    visited = [False] * len(dungeons)
    answer = dfs(k, dungeons, visited, 0)
    return answer