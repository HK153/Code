class Solution {
    public int solution(int k, int[][] dungeons) {
        boolean [] visited = new boolean[dungeons.length];
        int answer = dfs (k, dungeons, visited, 0, 0);

        return answer;
    }
    
    private int dfs(int k, int[][] dungeons, boolean [] visited, int maxCnt, int cnt){
        int m = maxCnt;
        for (int i=0; i< dungeons.length; i++){
            if (!visited[i] && k >= dungeons[i][0]){
                visited[i] = true;
                m = dfs(k - dungeons[i][1], dungeons, visited, m, cnt +1);
                visited[i] = false;
            }
        }
        return Math.max(cnt, m);
    }
}