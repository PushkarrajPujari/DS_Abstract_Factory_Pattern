package Start;

import DataStructureFactory.DS_Factory;
import Queue.AQueue;
import Queue.IQueue;
import Queue.LQueue;
import Stack.AStack;
import Stack.IStack;
import Stack.LStack;

/**
 * @author Pushkarraj
 * @since  25-02-2018.
 */
public class Main {
    public static void main(String[] args) {
        DS_Factory ds_factory = new DS_Factory("C:\\Code\\CodeBase\\Local\\Java\\DesignPatterns\\Factory_Design\\Abstract_Factory\\DS_Abstract_Factory\\src\\main\\java\\Configuration\\Stack.json");
        stackClient(ds_factory.getStack());

        AQueue aQueue = new AQueue(10);
        queueClient(aQueue);

        LQueue lQueue = new LQueue();
        queueClient(lQueue);
    }

    private static void queueClient(IQueue queue) {
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
        queue.print();
        System.out.println("Dequeue = "+queue.dequeue());
        System.out.println("Dequeue = "+queue.dequeue());
        System.out.println("Dequeue = "+queue.dequeue());
        queue.print();
    }

    public static void stackClient(IStack stack){
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);
        stack.push(60);
        stack.push(70);
        stack.push(80);
        stack.push(90);
        stack.print();
        System.out.println("Popped Value = "+stack.pop());
        System.out.println("Popped Value = "+stack.pop());
        System.out.println("Popped Value = "+stack.pop());
        System.out.println("Popped Value = "+stack.pop());
        stack.print();
    }
}
