class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        Stack<Integer>stk= new Stack<>();
        int[] result = new int[n];

        for(int i=0; i<n; i++){
            while(!stk.isEmpty() && temperatures[i]>temperatures[stk.peek()]){
            int prevIndex = stk.pop();
            result[prevIndex]=i-prevIndex;
        }
        stk.push(i);
        }
        return result;
    }
}
