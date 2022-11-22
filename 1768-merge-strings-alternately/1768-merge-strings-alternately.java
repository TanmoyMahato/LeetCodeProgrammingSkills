class Solution {
    public String mergeAlternately(String word1, String word2) {
        int  word1Idx=0, word2Idx=0;
        String newWord="";
        
      //traverse wrod1 and word 2 and add char alternatively
      //to newWord  
        while(true){
            if(word1Idx <= word1.length()-1){
                newWord += word1.charAt(word1Idx);
                word1Idx++;
            }
            if(word2Idx <= word2.length()-1){
                newWord += word2.charAt(word2Idx);
                word2Idx++;
            }
            if(word1Idx==word1.length() && word2Idx==word2.length()){
                break;
            }            
        }
        
        return newWord;
    }
}

