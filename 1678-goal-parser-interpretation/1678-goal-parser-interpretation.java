class Solution {
    public String interpret(String command) {
        int index=0;
        String goal="";
        
        while(index < command.length()){
            char ch = command.charAt(index);
            if(ch == '('){
                if(command.charAt(index+1) == ')'){
                    goal += "o";
                    index+=2;
                }
                else{
                    goal += "al";
                    index+=4;
                }
            }
            else{
                goal += "G";
                index++;
            }
        }
        
        return goal;
    }
}

