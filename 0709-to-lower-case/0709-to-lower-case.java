class Solution {
    public String toLowerCase(String s) {
        
        String lowerCaseS="";
        
        for(int index=0; index<s.length(); index++){
          //get ASCII Value of each char  
            int asciiVal = (int)s.charAt(index);
          //convert the char to Lower Case  
            if(asciiVal>=65 && asciiVal<=90){
                asciiVal = asciiVal + 32;
                lowerCaseS = lowerCaseS + (char)asciiVal;
            }
            else
                lowerCaseS = lowerCaseS + (char)asciiVal;
        }        
        return lowerCaseS;
        
        // 2nd Approach \U0001f447
        // return s.toLowerCase(); 
    }
}