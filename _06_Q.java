package Booksolutionjava.java;

public class _06_Q {
    public static void main(String[] args) {
        //Declaration and initialization
        int a = 10, b = 5, c = 8, d = 2;
        float x = 6.4f, y = 3.0f;
        int ans1 = a*b + c/d;
        System.out.println(ans1);
        int ans2 = a *(b +c) /d;
        System.out.println(ans2);
        float ans3 = x/y;
        System.out.println(ans3);
        float ans4 = x*y;
        System.out.println(ans4);
        boolean bool1 = a>b && c>d;
        System.out.println(bool1);
        boolean bool2 = a<b && c<d;
        System.out.println(bool2);
        boolean bool3 = a<b || c<d;
        System.out.println(bool3);
        boolean bool4 = a<b || c>d;
        System.out.println(bool4);
        boolean bool5 = ! (a -b == c);
        System.out.println(bool5);
        
    }
}
