class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='{' || s.charAt(i)=='[' || s.charAt(i) == '('){
                stack.push(s.charAt(i));
            }
            else{
                //Stack<Character> tempStack = new Stack<Character>();
                char toFindValue = s.charAt(i)==')'?'(':s.charAt(i)==']'?'[':'{';
                boolean pairFound = false;
                if(!stack.empty()){
                    char poppedValue = stack.pop();
                    if(poppedValue != toFindValue)
                        return false;
                    // if(poppedValue != toFindValue){
                    //     tempStack.push(poppedValue);
                    // }else{
                    //     pairFound = true;
                    //     break;
                    // }
                }else{
                    return false;
                }

                // while(!tempStack.empty()){
                //     stack.push(tempStack.pop());
                // }
                
            }
        }
        return stack.empty();
    }
}