package LearnCodingjava;
import java.util.*;

public class _16_findfactorofanumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any Number");
        int n;
        n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            if(n%i ==0){
                System.out.println(i+ " ");
            }
        }
    }
}
