class Solution {
    public String freqAlphabets(String s) {
    String alphabet[] = {" ","a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        
        String newS = "";
        int i = s.length()-1, index;
        while(i>=0){
            if(Character.compare(s.charAt(i),'#') == 0){
                index = Character.getNumericValue(s.charAt(i-2))*10 + Character.getNumericValue(s.charAt(i-1));
                newS = alphabet[index] + newS;
                i-=3;
            }
            else{
                index = Character.getNumericValue(s.charAt(i));
                newS = alphabet[index] + newS;
                i--;
            }                
        }
        
        return newS;
    }
}