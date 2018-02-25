package main.java.Stack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class Node {
    private Node next;
    private Object value;

    public Node(Object value,Node next){
        this.value = value;
        this.next = next;
    }

    public Node getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }
}
