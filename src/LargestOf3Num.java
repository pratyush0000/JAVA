import java.util.Scanner;

public class LargestOf3Num {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);

        System.out.println("Enter 3 numbers: ");
        int num1 = num.nextInt();
        int num2 = num.nextInt();
        int num3 = num.nextInt();

        int max = Math.max(num1 , Math.max(num2 , num3));
        System.out.println("The max integer is: " + max);
    }
}
