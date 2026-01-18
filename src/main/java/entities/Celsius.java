package entities;

public class Celsius {
    public int toFahrenheit(int tempInCelsius) {
        if (tempInCelsius < -273) throw new RuntimeException();
        return (int) (tempInCelsius * 1.8 + 32);
    }
}
