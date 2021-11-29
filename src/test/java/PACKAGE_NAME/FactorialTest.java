package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {

    @Test
    public void testFactorialFive(){
        //given
        Long expected = 120l;
        //when
        Long actual = Factorial.factorial(5);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialSeven(){
        //given
        Long expected = 5040l;
        //when
        Long actual = Factorial.factorial(7);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testFactorialNine(){
        //given
        Long expected = 362880l;
        //when
        Long actual = Factorial.factorial(9);
        //then
        Assert.assertEquals(expected, actual);
    }

}