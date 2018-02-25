package main.java.Stack;

/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public interface IStack<T> {
    public T push(T v);
    public T pop();
    public void print();
}
