public class Conditions {

    public static void main(String[] args) {
        int testScore = 60;

        if (testScore > 50) {
            System.out.println("Congratulations - you passed the test");
        } else if (testScore == 50)
            System.out.println("We are not sure if you passed");
        else {
            System.out.println("Sorry - you failed the test");
        }

        switch (testScore) {
            case 0 :
                System.out.println("Did you even take the test?");
                break;
            case 100:
                System.out.println("You go top marks!");
                break;
            default:
                System.out.println("you didn't do anything special");
                break;
        }

        int maxScore =100;

        if (testScore > 50 && testScore < maxScore) {
            System.out.println("you passed but didn't get full marks");
        }

        if (testScore < 10 || testScore > 90) {
            System.out.println("You are at the boundary.");
        }

        if (testScore != 100) {
            System.out.println("You didn't get top marks");
        }

    }
}
