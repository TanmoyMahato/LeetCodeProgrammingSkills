class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int min=Integer.MAX_VALUE, distance=0, index=0;
        
        for(int i=0; i<points.length; i++){
          //if(any one point matches with x or y)
            if( (x==points[i][0]) || (y==points[i][1])){                
                distance = Math.abs(x-points[i][0]) + Math.abs(y-points[i][1]);
              //store the minimum distance  
                if(distance < min){
                   min = distance;
                   index = i;
                }
            }                
        }
        
      //if(there is no minimum distance)  
        if(min == Integer.MAX_VALUE)
            return -1;
        
        return index;
    }
}