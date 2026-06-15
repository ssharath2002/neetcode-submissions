class MinStack {
    Stack<Integer>mainstack;
    Stack<Integer>minstack;

    public MinStack() {
        mainstack = new Stack<>();
        minstack = new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek()){
            minstack.push(val);
        }
    }
    
    public void pop() {
        if(mainstack.peek().equals(minstack.peek())){
            minstack.pop();
        }
        mainstack.pop();
    }
    
    public int top() {
        return mainstack.peek();
    
    }
    public int getMin() {
        return minstack.peek();
    }
}
