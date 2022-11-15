public class Solution {
    public int hammingWeight(int n) {
       int noOf1s = 0;
        
        for(int i=0; i<32; i++){
            if((n&1)==1)
                noOf1s++;
            n = n>>1;
        }
        
        return noOf1s; 
    }
}


