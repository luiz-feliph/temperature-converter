package entities;

public class Fahrenheit {
    public int toCelsius(int tempInFahrenheit) {
        if (tempInFahrenheit < -459) throw new RuntimeException();
        return (int) (tempInFahrenheit * 0.5) - 17;
    }
}
