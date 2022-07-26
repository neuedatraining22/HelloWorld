public class Loops {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Hello");
        }

        for (int i = 50; i <= 55; i++) {
            System.out.println(i *3);
        }

        int[] numbers = {12,16,9,4,22,104,66,8,222} ;
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        int counter = 0;
        while (counter < 10) {
            System.out.println("hello");
            counter++;
        }
        System.out.println("finished");

        int[] sampleArray = new int[50];
        int[] selectedNumbers = {1,2,4,9,5,7,3,6,8,10};

        int counter2 = 0;
        while (selectedNumbers[counter2] < 7) {
            System.out.println(selectedNumbers[counter2]);
            counter2++;
        }

        int myAge = 26;
        while (myAge < 20) {
            System.out.println("You are young");
            myAge++;
        }
        System.out.println(myAge);

        do {
            System.out.println("You are young");
            myAge++;
        } while (myAge < 20);
        System.out.println(myAge);


    }

}
