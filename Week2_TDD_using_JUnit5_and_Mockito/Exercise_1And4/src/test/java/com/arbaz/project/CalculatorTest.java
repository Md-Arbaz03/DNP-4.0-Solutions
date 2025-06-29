package com.arbaz.project;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calc;

    @Before
    public void setUp() {
        // Arrange (Setup)
        calc = new Calculator();
        System.out.println("Setup Complete");
    }

    @After
    public void tearDown() {
        // Cleanup
        calc = null;
        System.out.println("Teardown Complete");
    }

    @Test
    public void testAdd() {
        // Act
        int result = calc.add(2, 3);

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testSubtract() {
        int result = calc.subtract(10, 5);
        assertEquals(5, result);
    }
}
