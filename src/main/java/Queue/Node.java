package Queue;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class Node {
    private Node next;
    private Node previous;
    private Object value;

    Node(Node next, Object value){
        this.next = next;
        this.value = value;
    }

    public Node getNext() {
        return next;
    }

    public Object getValue() {
        return value;
    }

    public Node getPrevious() {
        return previous;
    }

    public void setPrevious(Node previous){
        this.previous = previous;
    }
}
