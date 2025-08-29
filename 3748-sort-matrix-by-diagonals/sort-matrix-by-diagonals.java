

class Solution {
    public int[][] sortMatrix(int[][] grid) {
        int n = grid.length;
        HashMap<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                map.computeIfAbsent(key, k -> new ArrayList<>()).add(grid[i][j]);
            }
        }

        for (int key : map.keySet()) {
            List<Integer> list = map.get(key);
            if (key >= 0) {
                list.sort(Collections.reverseOrder());
            } else {
                Collections.sort(list);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int key = i - j;
                List<Integer> list = map.get(key);
                grid[i][j] = list.remove(0);
            }
        }

        return grid;
    }
}
