class Solution {
    public boolean canMakeArithmeticProgression(int[] arr) {
        
      //sort the array
        Arrays.sort(arr);
        
      //get difference between the nos.  
        int difference = arr[1]-arr[0];
        
      //traverse the array  
        for (int i = 1; i<arr.length-1; i++) 
          //if(difference is not same, not an AP Sequence)  
            if (arr[i+1]-arr[i] != difference) 
                return false;
        
        return true;
    }
}


