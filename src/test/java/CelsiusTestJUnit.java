import entities.Celsius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CelsiusTestJUnit {

    private final Celsius celsius = new Celsius();

    @Test
    void toFahrenheit() {
        assertAll("convert to fahrenheit",
                () -> assertEquals(86, celsius.toFahrenheit(30)),
                () -> assertEquals(68, celsius.toFahrenheit(20)),
                () -> assertEquals(50, celsius.toFahrenheit(10))
        );
    }

    @Test
    void impossibleTemperature() {
        assertThrows(RuntimeException.class, () -> celsius.toFahrenheit(-274));
    }
}
