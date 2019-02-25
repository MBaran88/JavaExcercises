package Exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionTest {

    @Before

    public void initialization() {
    }

    double num1 = Math.random();
    double num2 = Math.random();
    Subtraction subtractionTests = new Subtraction();

    @Test

    public void shouldReturnDifference() {

        assertEquals(subtractionTests.subtraction(num1, num2), num1 - num2, 0);

    }

    @Test
    public void differenceShouldBeFiniteDouble(){

        assertTrue(Double.isFinite(subtractionTests.subtraction(num1,num2)));
    }
}