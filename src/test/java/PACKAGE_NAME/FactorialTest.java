package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void testFact1(){
        //given
        Integer expected = 5040;
        //when
        Integer actual = Factorial.factorial(7);
        //then
        Assert.assertEquals(expected, actual);
    }
}