class MyStack {
    Node first;
    Node last;

    public MyStack() {
        this.first = null;
        this.last = null;
    }
    
    public void push(int x) {
        Node node = new Node(x);
        if(this.first == null){
            this.first = node;
            this.last = first;
        } else {
            Node current = first;
            while(current.next != null){
                current = current.next;
            }
            node.prev = current;
            current.next = node;
            this.last = node;
        }
    }
    
    public int pop() {
        int val = this.last.val;
        if(this.last!= this.first){
            this.last.prev.next = null;
            this.last = last.prev;
        } else {
            this.first = null;
            this.last = null;
        }
        
        return val;
    }
    
    public int top() {
        return this.last.val;
    }
    
    public boolean empty() {
        return (this.first == null) && (this.last == null);
    }
}

class Node{
    Node prev;
    int val;
    Node next;
    public Node(){
        super();
    }
    public Node(int val){
        this.val = val;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */