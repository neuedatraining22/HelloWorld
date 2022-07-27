public class FibonacciChallenge {

    public static void main(String[] args) {
        int[] fibonacciNumbers = new int[40];
        fibonacciNumbers[0] = 0;
        fibonacciNumbers[1] = 1;

        for(int i = 2; i < fibonacciNumbers.length; i++) {
            fibonacciNumbers[i] = fibonacciNumbers[i-1] + fibonacciNumbers[i - 2];
        }

        int total = 0;
        int numberOfEvens =0;
        int numberDivisibleBy3 = 0;
        for(int i = 0; i < fibonacciNumbers.length; i++) {
            System.out.println(fibonacciNumbers[i]);
            total += fibonacciNumbers[i];
            if (fibonacciNumbers[i] % 2 == 0) {
                numberOfEvens++;
            }
            if (fibonacciNumbers[i] % 3 == 0) {
                numberDivisibleBy3++;
            }
        }
        System.out.println("The total is " + total);
        System.out.println("There are " + numberOfEvens + " even numbers");
        System.out.println("There are " + numberDivisibleBy3 + " divisible by 3");
        double average = (double)total / fibonacciNumbers.length;
        System.out.println("The average is " + average);
    }

}
