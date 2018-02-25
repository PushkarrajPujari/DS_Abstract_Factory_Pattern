package DataStructureFactory;

import Queue.AQueue;
import Queue.IQueue;
import Stack.AStack;
import Stack.IStack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class BoundedDataStructureFactory implements IAbstractFactory{
    private int length;

    public BoundedDataStructureFactory(int length) {
        this.length = length;
    }

    public IStack getStack() {
        return new AStack(length);
    }

    public IQueue getQueue() {
        return new AQueue(length);
    }
}
