package Javabydeepaksir;
import java.util.HashSet;

public class _18_Findfirstduplicateselementinanarray {
    public static void main(String[] args) {
        int[] a = {6, 5, 3, 2, 1, 2, 4,5};
        int temp = -1;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = a.length - 1; i >= 0; i--) {
            if (hs.contains(a[i])) {
                temp = i;
            } else {
                hs.add(a[i]);
            }
        }
        if (temp != -1) {
            System.out.println("first duplicates element is " + a[temp]);
        } else {
            System.out.println("Element not found");
        }
    }
}
