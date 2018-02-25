package Start;

import DataStructureFactory.BoundedDataStructureFactory;
import DataStructureFactory.DS_Factory;
import DataStructureFactory.IAbstractFactory;
import DataStructureFactory.UnboundedDataStructureFactory;
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
        /*DS_Factory ds_factory = new DS_Factory("C:\\Code\\CodeBase\\Local\\Java\\DesignPatterns\\Factory_Design\\Abstract_Factory\\DS_Abstract_Factory\\src\\main\\java\\Configuration\\DataStructure.json");
        stackClient(ds_factory.getStack());
        queueClient(ds_factory.getQueue());*/

        IAbstractFactory iAbstractFactory = new BoundedDataStructureFactory(20);
        stackClient(iAbstractFactory.getStack());
        queueClient(iAbstractFactory.getQueue());
        iAbstractFactory = new UnboundedDataStructureFactory();
        stackClient(iAbstractFactory.getStack());
        queueClient(iAbstractFactory.getQueue());
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
