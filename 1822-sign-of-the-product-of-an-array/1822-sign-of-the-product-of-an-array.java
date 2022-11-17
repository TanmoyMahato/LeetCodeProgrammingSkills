class Solution {
    public int arraySign(int[] nums) {
        
      //set initial sign as positive
        int sign = 1;
        
      //traverse the array
        for(int i=0; i<nums.length; i++){
          //if (0 is present product = 0)
            if(nums[i] == 0) 
                return 0;
          //if(no. is < 0 make sign -ve)
            else if(nums[i] < 0)
                sign = -sign;
        }
        
        return sign;
    }
}

