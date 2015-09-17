package exam01;

import java.util.ArrayList;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
    @Test
    public void testq1() {
        Box b = new Box();
        b.setValue(2);
        assertEquals(2, b.getValue());
        b.setValue(5);
        assertEquals(5, b.getValue());
    }

    @Test
    public void testq2() {
        int[] arr = {0,1,2,4,0};
        Q2 q = new Q2();
        assertTrue(q.allGreater(arr, -1));
        assertFalse(q.allGreater(arr, 0));
        assertFalse(q.allGreater(arr, 2));
        assertFalse(q.allGreater(arr, 5));
    }

    @Test
    public void testq3() {
        Q3 q = new Q3();
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(1);
        al.add(2);
        al.add(3);
        al.add(4);
        ArrayList<Integer> nal = q.keepOddElements(al);
        assertEquals(2, (int)nal.size());
        assertEquals(2, (int)nal.get(0));
        assertEquals(4, (int)nal.get(1));
    }

    @Test
    public void testq4() {
        Q4 q = new Q4();
        ArrayList<Integer> al = new ArrayList<Integer>();
        assertEquals(0, q.intersperse(al, 0).size());
        al.add(0);
        assertEquals(1, q.intersperse(al, 0).size());
        al.add(1);
        al.add(2);
        al.add(3);
        ArrayList<Integer> nal = q.intersperse(al, 0);
        assertEquals(7, nal.size());
        assertEquals(0, (int)nal.get(0));
        assertEquals(0, (int)nal.get(1));
        assertEquals(1, (int)nal.get(2));
        assertEquals(0, (int)nal.get(3));
        assertEquals(2, (int)nal.get(4));
        assertEquals(0, (int)nal.get(5));
        assertEquals(3, (int)nal.get(6));
    }
}
