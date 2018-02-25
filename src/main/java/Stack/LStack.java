package Stack;

import Stack.IStack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class LStack implements IStack {
    private Node head;

    public Object push(Object v) {
        head = new Node(v,head);
        return v;
    }

    public Object pop() {
        if(head == null){
            System.out.println("Stack is empty");
            return null;
        }else {
            Node temp = head;
            head = head.getNext();
            return (Integer) temp.getValue();
        }
    }

    public void print() {
        Node temp = head;
        System.out.println("******************** UnBounded Stack ***********************");
        while (temp != null){
            System.out.println("Stack value = "+temp.getValue());
            temp = temp.getNext();
        }
        System.out.println("******************** X End UnBounded Stack End X ***********************");
    }
}
