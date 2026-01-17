public class Test {
    public static void main(String[] args) {
        System.out.println(new Test().runTestStatus());
    }

    public String runTestStatus() {
        if (runTest()) {
            return "pass";
        }
        return "fail";
    }

    public boolean runTest() {
        Code code = new Code();

        boolean test1 = expectEqual(30, 86);
        boolean test2 = expectEqual(20, 68);
        boolean test3 = expectEqual(10, 50);

        return test1 && test2 && test3;
    }

    private boolean expectEqual(int input, int expected) {
        Code code = new Code();

        int actual = code.celsiusToFahrenheit(input);
        if (actual == expected) {
            System.out.println("Test passes, " + input + " is " + expected);
            return true;
        }
        System.out.println("Test failed, expected " + input + " to be " + expected + ", but was " + actual);
        return false;
    }
}