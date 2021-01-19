import java.util.ArrayList;
import java.util.Formatter;

/**
 * Scheme-like pairs that can be used to form a list of integers.
 *
 * @author P. N. Hilfinger; updated by Vivant Sakore (1/29/2020)
 */
public class IntSLList {

//    public static void main(String[] args) {
//        IntSLList node = new IntSLList(1,2,3,4,5);
//    }
    ArrayList<Integer> list = new ArrayList<>();
    /**
     * First and last nodes of list.
     */
    public ListNode front;
    public ListNode back;

    /**
     * An empty list.
     */
    public IntSLList() {
        front = back = null;
    }

    /**
     * @param values the ints to be placed in the IntDList.
     */
    public IntSLList(Integer... values) {
        front = back = null;
        for (int val : values) {
            insertBack(val);
        }
    }

    /**
     * @return The number of elements in this list.
     */
    public int size() {
        int n;
        n = 0;
        for (ListNode p = front; p != null; p = p.next) {
            n += 1;
        }
        return n;
    }

    public int get(int index) {
        ListNode dummy = front;
        for (int i = 0; i < index; i++) {
            dummy = dummy.next;
        }
        return dummy.val;
    }

    /**
     * @param d value to be inserted in the back
     */
    public void insertBack(int d) {
        ListNode node = new ListNode(d, null);
        if (front == null) {
            front = node;
            back = node;
        } else {
            back.next = node;
            back = back.next;
        }
    }

    /**
     * @return a string representation of the IntDList in the form
     * [] (empty list) or [1, 2], etc.
     */
    public String toString() {
        Formatter out = new Formatter();
        out.format("[");
        for (ListNode p = front; p != null; p = p.next) {
            if (p != front) {
                out.format(", ");
            }
            out.format("%d", p.val);
        }
        out.format("]");
        return out.toString();
    }

    /** after reverse, the back pointer will mess up*/
    public void reverseIter() {
        ListNode
    }

    /**
     * DNode is a "static nested class", because we're only using it inside
     * IntDList, so there's no need to put it outside (and "pollute the
     * namespace" with it.
     */
    public static class ListNode {

        /**
         * Next DNode.
         */
        public ListNode next;

        /**
         * Value contained in DNode.
         */
        public int val;

        /**
         * @param v the int to be placed in DNode.
         */
        public ListNode(int v) {
            this(v, null);
        }

        /**
         * @param v  value to be stored in DNode.
         * @param n next DNode.
         */
        public ListNode(int v, ListNode n) {
            this.val = v;
            this.next = n;
        }
    }
}
