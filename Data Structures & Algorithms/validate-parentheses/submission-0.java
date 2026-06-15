class Solution {
    public boolean isValid(String s) {
       Stack<Character> sc = new Stack<>();

       for(char ch:s.toCharArray()){
          if(ch=='(' || ch=='[' || ch=='{'){
              sc.push(ch);
          }
          else if(ch==')'){
            if(sc.isEmpty() || sc.peek()!='(') return false;
            sc.pop();
          }
          else if(ch==']'){
            if(sc.isEmpty() || sc.peek()!='[') return false;
            sc.pop();
          }
          else{
            if(sc.isEmpty()|| sc.peek()!='{') return false;
            sc.pop();
          }
            
          }
          return sc.isEmpty();
       }
    }

