import java.util.Arrays;
import java.util.Scanner;

public class array2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] thisarr = new int[6];

        System.out.println("enter elements of array(6): ");

        for (int i=0; i < thisarr.length;i++){
            thisarr[i] = scan.nextInt();
        }

        System.out.println("method 1 :");
        for (int i=0; i < thisarr.length;i++){
            System.out.print(thisarr[i]+ " ");
        }

        System.out.println(" ");

        System.out.println("method 2 :");
        System.out.println(Arrays.toString(thisarr));
    }
}
