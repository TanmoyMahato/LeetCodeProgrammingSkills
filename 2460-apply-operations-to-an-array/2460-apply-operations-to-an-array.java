class Solution {
    public int[] applyOperations(int[] nums) {
        
      //traverse nums and do the operations
        for(int index=0; index<nums.length-1; index++){
            if(nums[index] == nums[index+1]){
                nums[index] *= 2;
                nums[index+1] = 0;
                index++;
            }
        }
        
      //move zeros using Two-Pointer
        int pointer1=0;
        for(int pointer2=0; pointer2<nums.length; pointer2++){
            if(nums[pointer2] != 0){
                int temp = nums[pointer1];
                nums[pointer1++] = nums[pointer2];
                nums[pointer2] = temp;
            }
        }
        
        return nums;
    }
}