package ch06;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyTest {
    @Test
    public void testMultiplication(){
        Dollar five = Money.dollar(5);
        assertEquals(new Dollar(10), five.times(2));
        assertEquals(new Dollar(15),  five.times(3));
    }
    @Test
    public void testEquality(){
        assertTrue(new Dollar(5).equals(new Dollar(5)));
        assertFalse(new Dollar(6).equals(new Dollar(5)));
        assertTrue(new Franc(5).equals(new Franc(5)));
        assertFalse(new Franc(6).equals(new Franc(5)));
        assertFalse(new Franc(5).equals(new Dollar(5)));
    }

    @Test
    public void testFrancMultiplication(){
        Franc five = new Franc(5);
        assertEquals(new Franc(10), five.times(2));
        assertEquals(new Franc(15), five.times(3));
    }
}
