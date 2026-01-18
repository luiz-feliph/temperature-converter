import entities.Celsius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CelsiusTestJUnit {

    private final Celsius celsius = new Celsius();

    @Test
    void _30_celsius_is_86_fahrenheit() {
        assertEquals(86, celsius.toFahrenheit(30));
    }

    @Test
    void _20_celsius_is_68_fahrenheit() {
        assertEquals(68, celsius.toFahrenheit(20));
    }

    @Test
    void _10_celsius_is_50_fahrenheit() {
        assertEquals(50, celsius.toFahrenheit(10));
    }

    @Test
    void _minus_274_celsius_is_impossible() {
        assertThrows(RuntimeException.class, () -> celsius.toFahrenheit(-274));
    }
}
