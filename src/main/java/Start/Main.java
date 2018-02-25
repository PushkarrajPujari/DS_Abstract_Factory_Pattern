package main.java.Start;

import main.java.Stack.AStack;
import main.java.Stack.IStack;

/**
 * @author Pushkarraj
 * @since  25-02-2018.
 */
public class Main {
    public static void main(String[] args) {
        AStack aStack = new AStack(10);
        client(aStack);
    }

    public static void client(IStack stack){
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
