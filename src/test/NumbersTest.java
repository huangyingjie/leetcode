package test;

import com.hyj.Numbers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class NumbersTest {

    private Numbers num = new Numbers();
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetSingleNumber() throws Exception {
        int singleNum = num.getSingleNumber(new int[] {1,2,1,2,3,4,4});
        assertEquals(singleNum, 3);
    }
}