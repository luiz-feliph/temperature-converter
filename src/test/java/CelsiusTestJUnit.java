import entities.Celsius;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CelsiusTestJUnit {

    private final Celsius celsius = new Celsius();

    @Test
    void toFahrenheit() {
        assertEquals(85, celsius.toFahrenheit(30));
    }
}
