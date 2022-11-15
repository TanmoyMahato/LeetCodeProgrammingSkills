class Solution {
    public int subtractProductAndSum(int n) {
        int product=1, sum=0, rem;
        
        while(n!=0){
            rem = n%10;
            sum += rem;
            product *= rem;
            n = n/10;
        }
        
        return (product-sum);
    }
}


