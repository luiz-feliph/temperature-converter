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
        return false;
    }
}