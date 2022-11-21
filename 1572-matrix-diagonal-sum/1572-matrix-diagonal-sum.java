class Solution {
    public int diagonalSum(int[][] mat) {
        int columnIdx=mat.length-1, sum=0;
        
        for(int rowIdx=0; rowIdx<mat.length; rowIdx++){
            sum += mat[rowIdx][rowIdx];
          //skip the element at center of matrix  
            if(rowIdx != columnIdx){
                sum +=mat[rowIdx][columnIdx];
                columnIdx--;
            }
            else
                columnIdx--;
        }
        
        return sum;
    }
}

