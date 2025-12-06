import java.util.Stack;

public class ArrayStack<E extends Object> extends Stack<E> {
    private E[] data;
    public ArrayStack(int c) {
        data =(E[]) new Object[c];

    }

}
