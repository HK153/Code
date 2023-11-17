import java.util.*;
class Solution {
    public int solution(int[][] maps) {
        int n = maps.length;
        int m = maps[0].length;

        // 상하좌우 방향을 나타내는 배열
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        // BFS를 위한 큐
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0, 1});  // 시작 위치 (0, 0), 거리 1

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int x = current[0];
            int y = current[1];
            int distance = current[2];

            // 현재 위치가 상대 팀 진영에 도착한 경우
            if (x == n - 1 && y == m - 1) {
                return distance;
            }

            for (int[] dir : directions) {
                int nx = x + dir[0];
                int ny = y + dir[1];

                // 맵을 벗어나지 않고, 벽이 아니며, 방문하지 않은 경우
                if (0 <= nx && nx < n && 0 <= ny && ny < m && maps[nx][ny] == 1) {
                    queue.add(new int[]{nx, ny, distance + 1});
                    maps[nx][ny] = 0;  // 방문한 위치는 벽으로 바꿔줌 (중복 방문 방지)
                }
            }
        }

        // BFS를 마치고도 상대 팀 진영에 도착하지 못한 경우
        return -1;
    }
}