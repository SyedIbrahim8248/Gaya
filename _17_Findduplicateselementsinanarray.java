package Javabydeepaksir;
import java.util.Set;
import java.util.HashSet;

public class _17_Findduplicateselementsinanarray {
    public static void main(String[] args) {
        int [] arr ={3,5,4,3,2,2,1};
        System.out.println("duplicate elements in array");
        Set<Integer> s =new HashSet<>();
        for(int n : arr) {
            if(s.add(n) == false) {
                System.out.println(n);
            }
        }
    }
}
