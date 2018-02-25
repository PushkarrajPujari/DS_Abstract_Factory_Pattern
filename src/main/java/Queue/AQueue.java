package Queue;

/**
 * @author  Pushkarraj
 * @since 25-02-2018.
 */
public class AQueue implements IQueue{
    private Object [] queue;
    private int tail;

    public AQueue(int length) {
        this.queue = new Object[length];
        this.tail = queue.length;
    }

    public Object enqueue(Object v) {
        if(tail <= 0 ){
            System.out.println("Queue is full");
        }else{
            queue[--tail] = v;
            return v;
        }
        return null;
    }

    public Object dequeue() {
        Object temp;
        if(tail == queue.length){
            System.out.println("Queue is empty");
        }else {
            temp = queue[queue.length-1];
            for(int i = queue.length-1;i>tail;i--){
                queue[i] = queue[i-1];
            }
            tail++;
            return temp;
        }
        return null;
    }

    public void print() {
        System.out.println("=============== Bounded Queue ==============");
        for(int i = queue.length;i>tail;i--){
            System.out.println("queue["+i+"] = "+queue[i-1]);
        }
        System.out.println("=============== X End Bounded Queue End X ==============");
    }
}
