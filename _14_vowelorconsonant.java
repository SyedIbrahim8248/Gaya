package LearnCodingjava;
import java.util.*;

public class _14_vowelorconsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any Character");
        char ch = sc.next().charAt(0);
    if(ch =='a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){

           System.out.print("Vowel");
       } else  {
           System.out.print("Consonant");
       }



    }
}
