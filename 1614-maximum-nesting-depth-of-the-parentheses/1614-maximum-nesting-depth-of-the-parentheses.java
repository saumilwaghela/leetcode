class Solution {
    public int maxDepth(String s) {
        int maxValueOfDepth = 0;
        Stack <Character> stack = new Stack<Character>();
        int localCount = 0;
        for(int i=0; i<s.length(); i++){
           char ch = s.charAt(i);
           if(ch=='('){
               stack.push('(');
               ++localCount;
               maxValueOfDepth = Math.max(maxValueOfDepth,localCount);
           }
           if(ch==')'){
               if(!stack.empty()){
                     stack.pop();
                   --localCount;
               }
           }
            
        }
        return maxValueOfDepth;
    }
}