import java.util.Locale;

public class Strings {

    public static void main(String[] args) {
        String myName = "Matt";
        int length = myName.length();
        System.out.println("My name is " + myName);
        System.out.println("it has " + length + " characters");
        System.out.println(myName.toUpperCase());

        boolean containsAT = myName.contains("zat");
        System.out.println(containsAT);

        String phrase = "Many hands make light work.";
        System.out.println(phrase.startsWith("Many"));
        System.out.println(phrase.startsWith("many"));
        System.out.println(phrase.indexOf("light"));
        System.out.println(phrase.indexOf("Light"));
        System.out.println(phrase.indexOf("hello"));
        System.out.println(phrase.substring(16));
        System.out.println(phrase.substring(16, 21));
        System.out.println(phrase.replace("light", "heavy"));
        System.out.println(phrase);

        String name1 = "Dale McGovern";
        String name2 = "Dale Smethurst";
        String firstName1 = name1.substring(0,4);
        String firstName2 = name2.substring(0,4);
        System.out.println(firstName1);
        System.out.println(firstName2);

        boolean theyAreTheSame = firstName1.equals(firstName2);
        System.out.println(theyAreTheSame);


        String today = "Wednesday";

//        String tomorrow;
//        if (today.equals("Wednesday")) {
//            tomorrow = "Thursday";
//        }
//        else {
//            tomorrow = "I don't know";
//        }

        String tomorrow = today.equals("Wednesday") ? "Thursday" : "I don't know";
        System.out.println(tomorrow);

    }
}
