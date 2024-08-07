package coreJava;

public class FindSecondLargestNumber {

    public static void main(String[] args) {
        int[] numbers = {1, 25, 1, 54, 1, 12, 31, 13, -12, 11, 2};
        int largerst = numbers[0];
        int secondLargerst = numbers[0];
    if(numbers.length < 2)
        System.out.println("no Two numbers present Invalid input");

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > largerst){
                secondLargerst  = largerst;
                largerst = numbers[i];
            }
            if(numbers[i]<largerst && numbers[i]>secondLargerst)
                secondLargerst =numbers[i];
        }

        System.out.println( "Number " + secondLargerst);

    }
}
