class MinStack {
    Stack<Integer> minStack;
    public MinStack() {
        minStack = new Stack();
    }
    
    public void push(Integer val) {
        minStack.add(val);
    }
    
    public void pop() {
        minStack.pop();
    }
    
    public int top() {
        return minStack.get(minStack.size()-1);
    }
    
    public int getMin() {     
        Integer min =  minStack.get(minStack.size() - 1);
        Integer top = 0;
        // [1,2,0]
        // min = 0
        // top = 3 - 3 = 0, [0] = 1
        // 0 > 1 
        for(int i = 1; i <= minStack.size(); i++){
            top = minStack.get(minStack.size() - i);
            if(min > top){
                min = top;
            }
        }
        return min;
    }
}
