class Solution {
    public boolean isPathCrossing(String path) {
        Set<Integer> visited = new HashSet<>();
        visited.add(0);
        int x = 0, y = 0;
        for (int i=0;i<path.length();i++) {
            char c = path.charAt(i);
            if (c=='N') {
                y++;
            }
            if (c=='S') {
                y--;
            }
            if (c=='E') {
                x++;
            }
            if (c=='W') {
                x--;
            }
            if (!visited.add(x*10000+y)) {
                return true;
            }
        }
        return false;
    }
}