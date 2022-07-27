public class Methods {

    public static void printMyName(String name) {
        System.out.println(name);
    }

    public static int addTwoNumbers(int number1, int number2) {
        int total = number1 + number2;
        return total;
    }

    public static void main(String[] args) {
       printMyName("Simon");
       printMyName("Jenny");
        System.out.println(addTwoNumbers(14,62));
    }


}
