package Booksolutionjava.java;

public class _02_Q {
    public static void main(String[] args) {
        float pi = 3.14f;
        System.out.println("value of pi = " + pi);
        int m = 10;
        {
            int n = 20;
            {
                System.out.println("value of m = " + m);
                float a = 20.5f, b = 6.4f;
                System.out.println("value of a = " + a);
                System.out.println("value of b = " + b);
                System.out.println(a+b);
                System.out.println(a-b);
                System.out.println(a*b);
                System.out.println(a/b);
                System.out.println(a%b);
            }
        }
    }
}