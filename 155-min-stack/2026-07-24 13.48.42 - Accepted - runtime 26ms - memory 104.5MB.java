class MinStack {
    public MinStack(){
        
    }
    class Node{
     Node next;
     int data;
     int min;
    public Node(int data,int min) {
       this.data=data;
       this.min=min;
    }
    }
    Node head;
    public void push(int value) {
        if(head == null){ 
          head = new Node(value,value);
        }else{
          Node node= new Node(value,Math.min(value,head.min));
          node.next=head;
          head=node;
    }
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        int data = head.data;
        return data;
    }
    
    public int getMin() {
        return head.min;
    }
}


/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */