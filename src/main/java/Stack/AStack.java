package Stack;
/**
 * @author Pushkarraj
 * @since 25-02-2018.
 */
public class AStack implements IStack {
    private Object [] stack ;
    private int stackPointer;

    public AStack(int length){
        stack = new Object[length];
        stackPointer = stack.length;
    }

    public Object push(Object v) {
        if(stackPointer == 0){
            System.out.println("Stack Is Full");
        }else{
            stack[--stackPointer] = v;
            return v;
        }
        return null;
    }

    public Object pop() {
        if(stackPointer == stack.length){
            System.out.println("Stack Is Empty");
        }else {
            return stack[stackPointer++];
        }
        return null;
    }

    public void print() {
        System.out.println("================ Bounded Stack =================");
        for(int i = stackPointer;i<stack.length;i++){
            System.out.println("stack["+i+"] = "+stack[i]);
        }
        System.out.println("================ X End Bounded Stack End X =================");
    }
}
