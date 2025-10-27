package Booksolutionjava.java;

public class _33_Q {
    public static void main(String[] args) {
        short s1 = 3;//0000011
        short s2 = 13;//00001101
        s1 = (short) (s1 ^ s2);
        System.out.println(s1);
        s2 = (short) (s2 ^ s1);
        System.out.println(s2);
        int x = 10;
        int y = 20;
        System.out.println(x>y);
        
    }
}
