/**
 * Implement all the methods for ArrayStack.
 */
public class ArrayStack {
    protected final static int DEFAULT_STORAGE_SIZE = 10;
    protected Object[] storage;
    protected int top;

    public ArrayStack()
    {
        this(DEFAULT_STORAGE_SIZE);
    }

    public ArrayStack(int size)
    {
        if(size <= 0) return;
        storage = new Object[size];
        top = -1;
    }

    public void push(Object o)
    {
        /* Your code here */
    }

    public Object pop()
    {
        if(top == -1) throw new RuntimeException("Stack underflow");
        top--;
        return storage[top + 1];
    }

    public int size()
    {
        /* Your code here */
        return 0;
    }

    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack();
        try {
            System.out.printf("Empty pop: %d\n", (Integer)stack.pop());
        } catch (Exception ex) {
            System.out.printf("Got exception: %s\n", ex.getMessage());
        }
        stack.push(10);
        stack.push(5);
        stack.push(4);
        System.out.printf("Stack size: %d\n", stack.size());
        System.out.printf("First pop: %d\n", (Integer)stack.pop());
        System.out.printf("Second pop: %d\n", (Integer)stack.pop());
        System.out.printf("Third pop: %d\n", (Integer)stack.pop());
        try {
            System.out.printf("Fourth pop: %d\n", (Integer)stack.pop());
        } catch (Exception ex) {
            System.out.printf("Got exception: %s\n", ex.getMessage());
        }

    }
}
