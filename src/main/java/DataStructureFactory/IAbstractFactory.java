package DataStructureFactory;

import Queue.IQueue;
import Stack.IStack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public interface IAbstractFactory {
    public IStack getStack();
    public IQueue getQueue();
}
