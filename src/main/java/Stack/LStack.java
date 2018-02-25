package main.java.Stack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class LStack implements IStack<Integer>{
    private Node head;

    @Override
    public Integer push(Integer v) {
        head = new Node(v,head);
        return v;
    }

    @Override
    public Integer pop() {
        if(head == null){
            System.out.println("Stack is empty");
            return null;
        }else {
            Node temp = head;
            head = head.getNext();
            return (Integer) temp.getValue();
        }
    }

    @Override
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
