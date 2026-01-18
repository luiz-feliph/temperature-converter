import entities.Celsius;

public class CelsiusTest {
    public static void main(String[] args) {
        System.out.println(new CelsiusTest().runTestStatus());
    }

    public String runTestStatus() {
        if (runTest()) {
            return "pass";
        }
        return "fail";
    }

    public boolean runTest() {
        Celsius celsius = new Celsius();

        boolean test1 = expectEqual(30, 86);
        boolean test2 = expectEqual(20, 68);
        boolean test3 = expectEqual(10, 50);
        boolean test4 = expectInvalid(-274);

        return test1 && test2 && test3 && test4;
    }

    private boolean expectEqual(int input, int expected) {
        Celsius celsius = new Celsius();

        int actual = celsius.toFahrenheit(input);
        if (actual == expected) {
            System.out.println("Test passes, " + input + " is " + expected);
            return true;
        }
        System.out.println("Test failed, expected " + input + " to be " + expected + ", but was " + actual);
        return false;
    }

    private boolean expectInvalid(int input) {
        Celsius celsius = new Celsius();
        
        try {
            celsius.toFahrenheit(input);
        } catch (RuntimeException exception) {
            System.out.println("Test passes, " + input + " is invalid");
            return true;
        }
        System.out.println("Test failed, expected " + input + " to be invalid");
        return false;
    }
}