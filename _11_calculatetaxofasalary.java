package LearnCodingjava;
import java.util.*;

public class _11_calculatetaxofasalary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sal;
        double tax;
        sal= sc.nextInt();
        System.out.println("Enter Salary");
        if(sal<=10000){
            System.out.println(sal + " No Tax" );
        } else if(sal>10000 && sal<=100000)
        {
            tax = sal * 0.10;
            System.out.println(sal+" "+tax);
        } else {
            tax = sal  * 0.20;
            System.out.println(sal+ " "+tax);
        }
    }
}
