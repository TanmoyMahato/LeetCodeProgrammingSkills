class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
      //track mismatch index.
        int misMatchAtIndex1 = -1;
        int misMatchAtIndex2 = -1;
        
      //both strings must have same size  
        if(s1.length() != s2.length()){
            return false;
        }
        
      //traverse every char of both string 
        for(int i = 0;i<s1.length(); i++){
          //if(1st String's char != 2nd String's char)  
            if(s1.charAt(i) != s2.charAt(i)){
              //store the 1st index where char mismatch 
                if(misMatchAtIndex1 == -1) misMatchAtIndex1 = i; 
              //store the 2nd index where char mismatch
                else if(misMatchAtIndex2 == -1) misMatchAtIndex2 = i;
              //more than 2 mismatch not allowed, so return false;  
                else return false;
            } 
        }
        
      //all char are same in both string, return true
        if(misMatchAtIndex1 == -1) return true;
      //must be 2 mismatches, else swap cannot be done, return false  
        else if(misMatchAtIndex2 == -1) return false;
      //if mismatch indeces store same char, return true  
        return s1.charAt(misMatchAtIndex1) == s2.charAt(misMatchAtIndex2) && s1.charAt(misMatchAtIndex2) == s2.charAt(misMatchAtIndex1);
    }
}