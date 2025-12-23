package com.projet_devops;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    App app = new App();

    @Test
    void testAddition() {
        assertEquals(5, app.addition(2, 3));
    }

    @Test
    void testSoustraction() {
        assertEquals(1, app.soustraction(3, 2));
    }

    @Test
    void testMultiplication() {
        assertEquals(6, app.multiplication(2, 3));
    }

    @Test
    void testDivision() {
        assertEquals(2, app.division(4, 2));
    }

    @Test
    void testDivisionParZero() {
        assertThrows(IllegalArgumentException.class,
                () -> app.division(4, 0));
    }
}
