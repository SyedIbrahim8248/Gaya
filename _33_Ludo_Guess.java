package LearnCodingjava;
import java.util.*;

public class _33_Ludo_Guess {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt(6)+1;
        System.out.println(no);
        System.out.println("Enter your guess: ");
        int guess = sc.nextInt();
        if(guess ==no)
            System.out.println("Winner");
        else
            System.out.println("Looser");
    }
}
