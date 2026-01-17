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

        boolean test1 = code.celsiusToFahrenheit(30) == 86;
        boolean test2 = code.celsiusToFahrenheit(20) == 68;
        boolean test3 = code.celsiusToFahrenheit(10) == 50;

        return test1 && test2 && test3;
    }
}