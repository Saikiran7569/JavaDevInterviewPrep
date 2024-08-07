package coreJava;

public class Palindrome {

    public static void main(String[] args) {
        int number = 123215;  //121,123321
        int armstrong = number;
        int result = 0 ;

        while (number != 0){
            int temp = number % 10;
            result = result * 10 + temp;
            number = number/10;
        }
        System.out.println("reverse Number " + result);
        if(armstrong == result){
            System.out.println("number is palindrom "+ armstrong);
        }else {
            System.out.println("number is not palindrom "+ armstrong);
        }


    }
}
