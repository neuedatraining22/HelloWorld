import javax.naming.Name;

public class Methods {

    static int myAge = 21;

    public static void printMyName(String name) {
        System.out.println(name);
        System.out.println(myAge);
    }

    public static int addTwoNumbers(int number1, int number2) {
        int total = number1 + number2;
        System.out.println(total);
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
        NameManager.doSomething();

        Book book1 = new Book();
        book1.setTitle("Java for Dummies");
        book1.setAuthor("Doug Lowe");
        book1.setNumberOfPages(27);

        Book book2 = new Book();
        book2.setTitle("Python in easy steps");
        book2.setAuthor ("Mike McGrath");
        book2.setNumberOfPages(102);

        System.out.println(book2.getAuthor());
    }


}
