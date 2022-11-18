class Solution {
    public boolean checkStraightLine(int[][] c) {
      //First coordinates (x1, y1)
        int x1 = c[0][0];
        int y1 = c[0][1];

      //Second coordinates (x2, y2)
        int x2 = c[1][0];
        int y2 = c[1][1];
        
      //difference of the coordinates
        int dx = (x2 - x1);
        int dy = (y2 - y1);
        
        for (int i = 0; i < c.length; i++) {
            int x = c[i][0], y = c[i][1];
            if (dx * (y - y1) != dy * (x - x1)){
                return false;
            }
        }
        return true;
    }
}

