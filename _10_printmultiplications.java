package LearnCodingjava;
import java.util.*;

public class _10_printmultiplications {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Enter any Number");
        num = sc.nextInt();
        for(int i = 1; i<= 10;i++){
            System.out.println(num+ "*" +i+ "=" +num*i);
        }
    }

}
