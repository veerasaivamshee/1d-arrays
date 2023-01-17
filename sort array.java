import java.util.*;
 
class Main {
    public static void main(String args[])
    {
        int[] arr = { 5, -2, 23, 7, 87, -42, 509 };
        System.out.println("The original array is");
        for (int num ; arr ; arr++) {
            System.out.print(num + " ");
        }
        Arrays.sort(arr);
        System.out.println("The sorted array is: ");
        for (int num ; arr ; arr++) {
            System.out.print(num + " ");
        }
    }
}