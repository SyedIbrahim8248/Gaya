package Javabydeepaksir;

public class _11_Primenumber {
    public static void main(String[] args) {
        int num = 7;
        int temp = 0;
        for(int i = 2; i <= num-1; i++){
            if(num % i == 0){
                temp = temp + i;
            }
        }
        if(temp == 0){
            System.out.println("Prime number");
        } else {
            System.out.println("Not Prime number");
        }
    }
}
