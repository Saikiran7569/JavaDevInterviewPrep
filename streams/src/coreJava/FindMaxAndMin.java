package coreJava;

public class FindMaxAndMin {

    public static void main(String[] args) {
        int[] numbers = {1,25,1,54,1,12,31,13,-12,11,2};
        int max = numbers[0];
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>max)
                max =numbers[i];
            if (numbers[i]<min)
                min = numbers[i];
        }

        System.out.println("Max : "+max + " Min : "+min);
    }
}
