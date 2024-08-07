package coreJava;

public class Swap2Numbers {

    public static void main(String[] args) {
        int a = 30;
        int b = 20;
        System.out.println(" before swapping -> a :" + a + " b:" + b);
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("after Swapping -> a :" + a + " b:" + b);

        a = a^b;
        b = b^a;
        a=b^a;

        System.out.println("after bitwise  Swapping -> a :" + a + " b:" + b);
    }
}
