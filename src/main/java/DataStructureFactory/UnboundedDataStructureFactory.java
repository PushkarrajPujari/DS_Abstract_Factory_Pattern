package DataStructureFactory;

import Queue.IQueue;
import Queue.LQueue;
import Stack.IStack;
import Stack.LStack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class UnboundedDataStructureFactory implements IAbstractFactory{
    public IStack getStack() {
        return new LStack();
    }

    public IQueue getQueue() {
        return new LQueue();
    }
}
