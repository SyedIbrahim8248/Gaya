package Javabydeepaksir;

public class _13_palindromenumbers {
    public static void main(String[] args) {
        //Palindrome numbers = ex pop,121,bob,
        int n = 121;
        int temp = n;
        int rev = 0,rem;
        while(temp != 0){
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(n == rev) {
            System.out.println("Palindrome number");
        } else {
            System.out.println("Not a palindrome number");
        }
    }
}
