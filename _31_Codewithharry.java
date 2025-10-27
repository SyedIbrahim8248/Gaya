package Booksolutionjava.java;

public class _31_Codewithharry {
    public static void main(String[] args) {
        //wap to find factorial of a given num using for loops.
        int n = 5;
        //what is  factorial n = n*n-1*n-2.......1
         int i = 1;
         int fact = 1;
         while(i<=n) {
             fact *= i;
             i++;
         }
             System.out.println(fact);

         }
    }

