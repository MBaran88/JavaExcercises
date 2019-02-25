package Exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AdditionTest {

    @Before

    public void initialization() {
    }

    double num1 = Math.random();
    double num2 = Math.random();
    Addition additionTests = new Addition();

    @Test

    public void shouldReturnSum() {

        assertEquals(additionTests.addition(num1, num2), num1 + num2, 0);

    }

    @Test
    public void sumShouldBeFiniteDouble(){

        assertTrue(Double.isFinite(additionTests.addition(num1,num2)));
    }
}