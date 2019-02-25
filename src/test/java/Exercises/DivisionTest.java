package Exercises;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionTest {

    @Before

    public void initialization() {
    }

    double num1 = Math.random();
    double num2 = Math.random();
    Division divisionTests = new Division();

    @Test

    public void shouldReturnDifference() {

        assertEquals(divisionTests.division(num1, num2), num1 / num2, 0);

    }

    @Test
    public void DifferenceShouldBeFiniteDouble(){

        assertTrue(Double.isFinite(divisionTests.division(num1,num2)));
    }
}