package Queue;

/**
 * @author  Pushkarraj
 * @since 25-02-2018.
 */
public class LQueue implements IQueue{
    private Node head;
    private Node tail;

    public Object enqueue(Object v) {
        if(head == null && tail == null){
            head = tail = new Node(head,v);
        }else{
            Node temp = head;
            head = new Node(head,v);
            temp.setPrevious(head);
        }
        return v;
    }

    public Object dequeue() {
        if(tail == null){
            System.out.println("Queue is empty");
        }else {
            Node temp = tail;
            tail = tail.getPrevious();
            return temp.getValue();
        }
        return null;
    }

    public void print() {
        System.out.println("******************* UnBounded Queue **********************");
        Node temp = tail;
        while(temp != null){
            System.out.println("Queue value = "+temp.getValue());
            temp = temp.getPrevious();
        }
        System.out.println("******************* X End UnBounded Queue End X **********************");
    }
}
