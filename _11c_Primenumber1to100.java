package Javabydeepaksir;

public class _11c_Primenumber1to100 {
    public static void main(String[] args) {
        for(int n = 1; n <= 100; n++) {
            int temp = 0;
            for(int i = 2; i <= n-1; i++) {
                if(n % i == 0) {
                    temp += i;
                }
            }
            if(temp == 0) {
                System.out.println(n);
            }
        }
    }

}
//total 26 prime numbers between 1 to 100