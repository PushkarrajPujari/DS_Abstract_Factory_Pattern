package Start;

import DataStructureFactory.DS_Factory;
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
        client(ds_factory.getStack());
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
