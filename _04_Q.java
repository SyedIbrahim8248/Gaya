package Booksolutionjava.java;

public class _04_Q {
    public static void main(String[] args) {
        int m = 10;
        int n = 20;
        System.out.println(m);
        System.out.println(n);
        System.out.println(++m);
        System.out.println(++n);
        System.out.println(m++);
        System.out.println(n++);
        System.out.println(+n);
        System.out.println(+m);
        int  a = 5;
        int  b = 10;
        int result = ++a* b--;
        System.out.println(result);
        int result1 = ++a* --b;
        System.out.println(result1);
        int x = 2;
        int y = 5;
        x  = x ++ * x ++ * x ++;
        y = y * y ++;
        System.out.println(x);
        System.out.println(y);


    }
}
