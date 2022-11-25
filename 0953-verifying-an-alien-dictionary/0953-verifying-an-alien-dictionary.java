class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        for(int i=0 ; i<words.length-1 ; i++){
        boolean same = true;
        String a = words[i], b = words[i+1];
        for(int k=0 ; k<Math.min(a.length(),b.length()) ; k++){
            if(a.charAt(k) != b.charAt(k)){
                same = false;
                int index_a = order.indexOf(a.charAt(k));
                int index_b = order.indexOf(b.charAt(k));
                if(index_b < index_a){
                    return false;
                }
                break;
            } 
        }
        if(same && a.length() > b.length()){
           return false;
        }
    }
    return true;
    }
}