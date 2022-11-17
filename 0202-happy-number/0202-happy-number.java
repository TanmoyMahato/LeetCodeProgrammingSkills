//using Floyd Cycle detection algorithm 
class Solution {
    
  //get Sum of digit's square
    public int sumOfDigitSquare(int n) {
        int sumOfSquare = 0, digit;
        while(n!=0) {
            digit = n % 10;
            sumOfSquare += digit*digit;
            n /= 10;
        }
        return sumOfSquare;
    }
    
    
    public boolean isHappy(int n) {
      //declare slow & fast pointers
        int slow, fast;
        slow = fast = n;
      //slow==fast only when slow=fast=1  
        do {
            slow = sumOfDigitSquare(slow);
            fast = sumOfDigitSquare(sumOfDigitSquare(fast));
            if(fast == 1) return true;
        } while(slow != fast);
                
        return false; 
    }
}