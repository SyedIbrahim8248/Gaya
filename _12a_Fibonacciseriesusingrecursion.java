package Javabydeepaksir;

public class _12a_Fibonacciseriesusingrecursion {
    static int a = 0,b = 1,c;
    public static void main(String[] args) {
        System.out.println(a+" "+b);
        _12a_Fibonacciseriesusingrecursion ob = new _12a_Fibonacciseriesusingrecursion();
        ob.printFib(10);
    }
    void printFib(int i) {
        if(i>=1) {
            c = a+b;
            System.out.println(" "+c);
            a = b;
            b = c;
            printFib(i-1);

        }
    }
}
