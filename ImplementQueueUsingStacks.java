class MyQueue {
    private Stack stack;

    public MyQueue() {
        this.stack = new Stack();
    }
    
    public void push(int x) {
      stack.add(0, x);
    }
         
    
    public int pop() {
        return (int) stack.pop();
    }
    
    public int peek() {
        return (int) stack.peek();
    }
    
    public boolean empty() {
        return stack.isEmpty();
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
