class Solution {
    static void maze(int[][] m, int n, StringBuilder path, ArrayList<String> ans, int i, int j, int[][] visited) {
        if (i < 0 || j < 0 || i >= n || j >= n || m[i][j] == 0 || visited[i][j] == 1) {
            return;
        }
        if (i == n - 1 && j == n - 1) {
            ans.add(path.toString());
            return;
        }
        
        visited[i][j] = 1;

        // Move Up
        path.append("U");
        maze(m, n, path, ans, i - 1, j, visited);
        path.deleteCharAt(path.length() - 1);

        // Move Down
        path.append("D");
        maze(m, n, path, ans, i + 1, j, visited);
        path.deleteCharAt(path.length() - 1);

        // Move Left
        path.append("L");
        maze(m, n, path, ans, i, j - 1, visited);
        path.deleteCharAt(path.length() - 1);

        // Move Right
        path.append("R");
        maze(m, n, path, ans, i, j + 1, visited);
        path.deleteCharAt(path.length() - 1);

        visited[i][j] = 0;
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        StringBuilder path = new StringBuilder();
        ArrayList<String> ans = new ArrayList<>();
        int[][] visited = new int[n][n];
        maze(m, n, path, ans, 0, 0, visited);
        return ans;
    }
}
