class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> pis = new Stack<>();
        for(String token : tokens){
             if(token.equals("+")){
                int b=pis.peek();
                pis.pop();
                int a=pis.peek();
                pis.pop();
                pis.push(b+a);
            }
            else if(token.equals("-")){
                int b = pis.peek();
                pis.pop();
                int a = pis.peek();
                pis.pop();
                pis.push(a-b);
            }
            else if(token.equals("*")){
                int b=pis.peek();
                pis.pop();
                int a=pis.peek();
                pis.pop();
                pis.push(b*a);
            }
            else if(token.equals("/")){
                int b=pis.peek();
                pis.pop();
                int a=pis.peek();
                pis.pop();
                pis.push(a/b);
            }
            else{
                pis.push(Integer.parseInt(token));
            }
        }
        return pis.peek();
}
}
