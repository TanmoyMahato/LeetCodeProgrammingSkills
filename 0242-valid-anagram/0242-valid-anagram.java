class Solution {
    public boolean isAnagram(String s, String t) {
        var fs = new int[26]; 
        var ft = new int[26];
        
        for(var c: s.toCharArray()){
            fs[c-'a']++; 
        }
        for(var c: t.toCharArray()){ 
            ft[c-'a']++;
        }
        
        for(int i = 0; i < 26; i++){ 
            if(fs[i] != ft[i])
                return false;
        }
        
        return true;
    }
}