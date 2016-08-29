import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayStackTest {
    protected ArrayStack stack;
    @Before
    public void setUp() throws Exception {
        stack = new ArrayStack(5);
    }

    @Test
    public void normalOperation() throws Exception {
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
        } catch(RuntimeException ex) {
            fail("Throw RuntimeException" + ex.getMessage());
        }

        try {
            assertEquals(3, stack.pop());
            assertEquals(2, stack.pop());
            assertEquals(1, stack.pop());
        } catch(RuntimeException ex) {
            fail("Throw RuntimeException" + ex.getMessage());
        }
    }

    @Test
    public void underflowOperation() throws Exception {
        try {
            stack.pop();
            fail("Expect exception");
        } catch(RuntimeException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void overflowOperation() throws Exception {
        try {
            stack.push(1);
            stack.push(2);
            stack.push(3);
            stack.push(4);
            stack.push(5);
            stack.push(6);
            fail("Expect exception");
        } catch(RuntimeException ex) {
            assertTrue(true);
        }
    }

    @Test
    public void sizeOperation() throws Exception {

        try {
            assertEquals(0, stack.size());
            stack.push(1);
            assertEquals(1, stack.size());
            stack.push(2);
            assertEquals(2, stack.size());
            stack.push(3);
            assertEquals(3, stack.size());
        } catch(RuntimeException ex) {
            fail("Throw RuntimeException" + ex.getMessage());
        }

        try {
            assertEquals(3, stack.size());
            stack.pop();
            assertEquals(2, stack.size());
            stack.pop();
            assertEquals(1, stack.size());
            stack.pop();
            assertEquals(0, stack.size());
        } catch(RuntimeException ex) {
            fail("Throw RuntimeException" + ex.getMessage());
        }
    }

}