package Queue;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public interface IQueue<T> {
    public T enqueue(T v);
    public T dequeue();
    public void print();
}
