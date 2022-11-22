class Solution {
    public char findTheDifference(String s, String t) {
      /*
        calculate sum of ASCVII vslue of all the char in t
        subtract it with the sum of ASCII values of all char in s
      */  
        
        int tCharSum = 0;
      //calculate sum of ASCII value in t  
        for (int tIndex=0; tIndex<t.length(); tIndex++){
            tCharSum += t.charAt(tIndex);
        }
      //subtract sum of ASCII value of s from t  
        for (int sIndex = 0; sIndex<s.length(); sIndex++){
            tCharSum -= s.charAt(sIndex);
        }
        
        return (char)tCharSum;
    }
}

