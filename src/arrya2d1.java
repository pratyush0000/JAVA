import java.util.Arrays;
import java.util.Scanner;

public class arrya2d1 {
    public static void main(String[] args) {
        int[][] array2d = new int[3][3];

        Scanner arrscan = new Scanner(System.in);

        System.out.println("enter integers for 3x3 matrix:");

        for(int row = 0;row < array2d.length;row++){
            for(int col = 0; col < array2d[row].length;col++){
                array2d[row][col] = arrscan.nextInt();
            }
        }


        //printing the array
        System.out.println("method 1:");
        for(int row = 0;row < array2d.length;row++){
            for(int col = 0; col < array2d[row].length;col++){
                System.out.print(array2d[row][col] + " ");
            }
            System.out.println();
        }

        System.out.println("method 2:");
        for(int row = 0;row < array2d.length;row++){
            System.out.println(Arrays.toString(array2d[row]));
        }
    }
}
