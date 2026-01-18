import entities.Fahrenheit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FahrenheitTestJUnit {

    private final Fahrenheit fahrenheit = new Fahrenheit();

    @Test
    void toCelsius() {
        assertAll("convert to fahrenheit",
                () -> assertEquals(-17, fahrenheit.toCelsius(0)),
                () -> assertEquals(-12, fahrenheit.toCelsius(10)),
                () -> assertEquals(-6, fahrenheit.toCelsius(20)),
                () -> assertEquals(-1, fahrenheit.toCelsius(30)),
                () -> assertEquals(0, fahrenheit.toCelsius(32)),
                () -> assertEquals(30, fahrenheit.toCelsius(86))
        );
    }

    @Test
    void impossibleTemperature() {
        assertThrows(RuntimeException.class, () -> fahrenheit.toCelsius(-460));
    }
}
