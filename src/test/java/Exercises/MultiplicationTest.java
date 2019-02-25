package Exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTest {

    @Before

    public void initialization() {
    }

    double num1 = Math.random();
    double num2 = Math.random();
    Multiplication multiplicationTests = new Multiplication();

    @Test

    public void shouldReturnProduct() {

        assertEquals(multiplicationTests.multiplication(num1, num2), num1 * num2, 0);

    }

    @Test
    public void productShouldBeFiniteDouble(){

        assertTrue(Double.isFinite(multiplicationTests.multiplication(num1,num2)));
    }
}