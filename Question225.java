import java.util.Queue;
import java.util.LinkedList;

public class MyStack { 
   
    private Queue<Integer> mystack;

    public MyStack() {
        mystack = new LinkedList<>();
    }
    
    public void push(int x) {
        mystack.add(x);
        int size = mystack.size();
      
        while (size > 1) {
            mystack.add(mystack.remove());
            size--;
        }
    }
    
    public int pop() {
        return mystack.remove();
    }
    
    public int top() {
        return mystack.peek();
    }
    
    public boolean empty() {
        return mystack.isEmpty();
    }
}