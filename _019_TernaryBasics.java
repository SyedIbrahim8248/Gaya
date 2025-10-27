package ibrahimjava;
import java.util.Scanner;
public interface _019_TernaryBasics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter No:");
        int n = sc.nextInt();
        if(n%2 == 0) System.out.println("Even");
        else System.out.println("Odd");

    }
}
