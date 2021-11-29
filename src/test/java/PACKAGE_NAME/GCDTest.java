package PACKAGE_NAME;

import org.junit.Assert;
import org.junit.Test;

import java.time.Duration;
import java.time.Instant;

import static org.junit.Assert.*;

public class GCDTest {
    @Test
    public void testGCD1(){
        //given
        Integer expected = 1;
        //when
        Integer actual = GCD.gcd(7, 3);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testGCD2(){
        //given
        Integer expected = 300;
        //when
        Integer actual = GCD.gcd2(1200, 300);
        //then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testTiming(){
        //given
        GCD testGCD = new GCD();
        //when
        Instant begin = Instant.now();
    }

}