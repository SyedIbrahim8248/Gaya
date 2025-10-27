package LearnCodingjava;
import java.util.*;

public class _18_Printmatrixusing2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a[][] = new int[2][2];
        System.out.print("Enter Array Elements");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("Matrix: \n");
        for(int i = 0;i<2;i++){
            for(int j = 0;j<2;j++){
                System.out.print(a[i][j]+ " ");
            }
            System.out.println("\n");
        }
    }
}
