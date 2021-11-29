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
            Instant beginGCD = Instant.now();
            GCD.gcd(5, 1);
            Instant endGCD = Instant.now();
            //when
            Instant beginGCD2 = Instant.now();
            GCD.gcd2(5, 1);
            Instant endGCD2 = Instant.now();
            long timeElapsed1 = Duration.between(beginGCD, endGCD).toMillis();
            long timeElapsed2 = Duration.between(beginGCD2, endGCD2).toMillis();

            boolean actual = timeElapsed1 > timeElapsed2;
            //then
            Assert.assertTrue(actual);
    }

}