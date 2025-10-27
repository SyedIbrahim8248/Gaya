package Javabydeepaksir;


public class _08_Anonymousarrays {
    public static void main(String[] args) {
        _08_Anonymousarrays.sum(new int[]{10, 20, 30});
    }

    static void sum(int[] no) {
        int total = 0;
        for (int i : no) {
            total += i;
        }
        System.out.println("sum is): " + total);
    }
}

