class Solution {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<Integer>();
        int count=0;
        for(int i=0;i<ops.length;i++){
            if(ops[i].equals("+")){
                int t2=stack.pop();
                int t1=stack.pop();
                stack.push(t1);
                stack.push(t2);
                stack.push(t1+t2);
            }else if(ops[i].equals("D")){
                stack.push(2*stack.peek());
            }else if(ops[i].equals("C")){
                stack.pop();
            }else{
                stack.push(Integer.parseInt(ops[i]));
            }
        }
        while(!stack.empty()){
            count+=stack.pop();
        }
        return count;
    }
}