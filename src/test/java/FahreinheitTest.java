import entities.Fahrenheit;

public class FahreinheitTest {
    public static void main(String[] args) {
        System.out.println(new FahreinheitTest().runTest() ? "pass" : "fail");
    }

    public boolean runTest() {
        boolean test1 = expectEqual(0, -17);
        boolean test2 = expectEqual(10, -12);
        boolean test3 = expectEqual(20, -6);
        boolean test4 = expectEqual(30, -1);
        boolean test5 = expectEqual(32, 0);
        boolean test6 = expectEqual(86, 30);
        boolean test7 = expectInvalid(-460);

        return test1 && test2 && test3 && test4 && test5 && test6 && test7;
    }

    private boolean expectEqual(int input, int expected) {
        Fahrenheit fahrenheit = new Fahrenheit();
        int actual = fahrenheit.toCelsius(input);

        if (actual == expected) {
            System.out.println("Test passes, " + actual + " is equals to " + expected);
            return true;
        }
        System.out.println("Test failed, expected " + expected + " but the result was " + actual);
        return false;
    }

    private boolean expectInvalid(int input) {
        Fahrenheit fahrenheit = new Fahrenheit();

        try {
            fahrenheit.toCelsius(input);
        } catch (RuntimeException e) {
            System.out.println("Test passes, " + input + " is invalid");
            return true;
        }
        System.out.println("Test failed, expected " + input + " to be invalid");
        return false;
    }
}
