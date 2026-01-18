public class Celsius {
    public int toFahrenheit(int tempInCelsius) {
        if (tempInCelsius < -273) throw new RuntimeException();
        int tempInFarenheit = (int) (tempInCelsius * 1.8 + 32);
        return tempInFarenheit;
    }
}
