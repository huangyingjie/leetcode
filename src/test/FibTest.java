package test;

import com.hyj.dp.Fib;
import static org.junit.Assert.*;

public class FibTest {

    private Fib fib = new Fib();
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testGetFib() throws Exception {
        assertEquals(8, fib.getFib(6));
    }
}