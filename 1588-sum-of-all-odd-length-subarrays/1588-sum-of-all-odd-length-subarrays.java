class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int oddSubarraySum = 0;
        for (int index=0; index<arr.length; index++) {
            oddSubarraySum += ((index+1) * (arr.length-index) + 1) / 2 * arr[index];
        }
        return oddSubarraySum;
    }
}

