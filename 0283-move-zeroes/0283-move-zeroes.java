class Solution {
    public void moveZeroes(int[] nums) {
        int pointer1 = 0;
        for(int pointer2=0; pointer2<nums.length; pointer2++){
            if(nums[pointer2] != 0){
                int temp = nums[pointer1];
                nums[pointer1++] = nums[pointer2];
                nums[pointer2] = temp;
            }
        }
    }
}