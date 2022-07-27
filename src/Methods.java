public class Methods {

    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int addTwoNumbers(int number1, int number2) {
        int total = number1 + number2;
        return total;
    }

    public static String getVersionNumber() {
        return "1.0";
    }

    public static String getStatus(int age) {
        if (age < 18) {
            return "child";
        }
        else if (age >=18) {
            return "adult";
        }
        return "Uknown status";
    }

    public static void main(String[] args) {
       printMyName("Simon");
       printMyName("Jenny");
        System.out.println(addTwoNumbers(14,62));
        System.out.println(getVersionNumber());
        System.out.println(getStatus(17));
        System.out.println(getStatus(27));
    }


}
