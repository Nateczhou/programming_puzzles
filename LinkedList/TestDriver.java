import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class TestDriver {
    @Test
    public void TestReverseList() {
        IntSLList input = new IntSLList(1,2,3,4,5);
        IntSLList expected = new IntSLList(5,4,3,2,1);

        input.reverseIter();

        assertEquals("the expected value is ",5, input.get(0));
        assertEquals("the expected value is ",4, input.get(1));
        assertEquals("the expected value is ",3, input.get(2));
        assertEquals("the expected value is ",2, input.get(3));
        assertEquals("the expected value is ",1, input.get(4));

    }
}