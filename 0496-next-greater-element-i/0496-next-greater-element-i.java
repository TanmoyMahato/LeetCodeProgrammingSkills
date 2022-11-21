class Solution {
    
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        
        int[] output = new int[nums1.length];
        
        for(int index1 = 0; index1 < nums1.length; index1++) {
            int nextGreaterIdx = -1, index2 = nums2.length - 1;
            while(index2 >= 0 && nums2[index2]!=nums1[index1]) {
                if(nums2[index2] > nums1[index1]){
                    nextGreaterIdx = nums2[index2];
                }
                index2--;
            }
            output[index1] = nextGreaterIdx;
        }
        
        return output;
    }
}