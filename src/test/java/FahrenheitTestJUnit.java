import entities.Fahrenheit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitTestJUnit {

    private final Fahrenheit fahrenheit = new Fahrenheit();

    @Test
    void _0_fahrenheit_is_minus_17_celsius() {
        assertEquals(-17, fahrenheit.toCelsius(0));
    }

    @Test
    void _10_fahrenheit_is_minus_12_celsius() {
        assertEquals(-12, fahrenheit.toCelsius(10));
    }

    @Test
    void _20_fahrenheit_is_minus_6_celsius() {
        assertEquals(-6, fahrenheit.toCelsius(20));
    }

    @Test
    void _30_fahrenheit_is_minus_1_celsius() {
        assertEquals(-1, fahrenheit.toCelsius(30));
    }

    @Test
    void _32_fahrenheit_is_0_celsius() {
        assertEquals(0, fahrenheit.toCelsius(32));
    }

    @Test
    void _86_fahrenheit_is_30_celsius() {
        assertEquals(30, fahrenheit.toCelsius(86));
    }

    @Test
    void _460_fahrenheit_is_impossible() {
        assertThrows(RuntimeException.class, () -> fahrenheit.toCelsius(-460));
    }
}
