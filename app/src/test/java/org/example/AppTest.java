package org.example;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AppTest {
    @Test
    void appHasAGreeting() {
        App classUnderTest = new App();
        assertEquals("Hello, JUnit!", classUnderTest.getHello());
    }

    @Test
    void testDivision() {
        App classUnderTest = new App();

        ArithmeticException exception = assertThrows(ArithmeticException.class, () -> classUnderTest.division(10, 0) );
        assertEquals(ArithmeticException.class.getName(), exception.getClass().getName());
        assertDoesNotThrow(() -> { 
            classUnderTest.division(10, 1); 
        });
    }
}
