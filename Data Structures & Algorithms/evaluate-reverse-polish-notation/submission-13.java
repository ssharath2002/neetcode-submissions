class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer>sc= new Stack<>();
        for(String token: tokens ){
            if(token.equals("+")||token.equals("*")|| token.equals("-")||token.equals("/")){
                int a =sc.pop();
                int b = sc.pop();
                int result=0;
                switch(token){
                     case "+":
                     result= a+b;
                     break;

                     case "-":
                     result=b-a;
                     break;

                     case "*":
                     result=a*b;
                     break;

                     case "/":
                     result=b/a;
                     break;

                }
                sc.push(result);
            }
            else{
                sc.push(Integer.parseInt(token));
            }
        }
        return sc.pop();
    }
}
