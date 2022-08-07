package ch08;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    @Test
    public void testMultiplication(){
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15),  five.times(3));
    }
    @Test
    public void testEquality(){
        assertTrue(Money.dollar(5).equals(Money.dollar(5)));
        assertFalse(Money.dollar(6).equals(Money.dollar(5)));
        assertTrue(Money.franc(5).equals(Money.franc(5)));
        assertFalse(Money.franc(6).equals(Money.franc(5)));
        assertFalse(Money.franc(5).equals(Money.dollar(5)));
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = Money.franc(5);
        assertEquals(Money.franc(10), five.times(2));
        assertEquals(Money.franc(15), five.times(3));
    }
    @Test
    public void testCurrency(){
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }

    @Test
    public void testDifferentClassEquality(){
        assertTrue(new Dollar(10, "CHF").equals(new Franc(10, "CHF")));
    }
}