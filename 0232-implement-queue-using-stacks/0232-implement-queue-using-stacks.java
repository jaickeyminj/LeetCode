class MyQueue {
    Stack<Integer> stk1;
    Stack<Integer> stk2;
    public MyQueue() {
        stk1 = new Stack<Integer>();
        stk2 = new Stack<Integer>();
    }
    
    public void push(int x) {
        stk1.push(x);
    }
    
    public int pop() {
        int s = stk1.size();
        for(int i=0;i<s-1;i++) stk2.push(stk1.pop());
        int data = stk1.pop();
        while(!stk2.isEmpty()) stk1.push(stk2.pop());
        return data;
    }
    
    public int peek() {
        int s = stk1.size();
        for(int i=0;i<s-1;i++) stk2.push(stk1.pop());
        int data = stk1.peek();
        while(!stk2.isEmpty()) stk1.push(stk2.pop());
        return data; 
    }
    
    public boolean empty() {
        return stk1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */