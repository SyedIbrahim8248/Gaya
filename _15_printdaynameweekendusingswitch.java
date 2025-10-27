package LearnCodingjava;
import java.util.*;

public class _15_printdaynameweekendusingswitch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter code of Day");
        int n;
        n = sc.nextInt();
                switch (n){
                    case 0: System.out.print("Sunday");
                    break;
                    case 1: System.out.print("Monday");
                        break;
                    case 2: System.out.print("Saturday");
                    break;
                    case 3: System.out.print("Tuesday");
                        break;
                    case 4: System.out.print("Wednesday");
                        break;
                    case 5: System.out.print("Thursday");
                        break;
                    case 6: System.out.print("Saturday");
                        break;
                    default: System.out.print("invalid code");
                    break;









                }
    }
}
