import java.util.Scanner;

public class SumOf2Numbers {
    public static void main(String[] args) {

        Scanner ask = new Scanner(System.in);

        System.out.println("Adding 2 Integers");

        System.out.print("Enter 1st number: ");
        int int1 = ask.nextInt();

        System.out.print("Enter 2nd Number: ");
        int int2 = ask.nextInt();

        int sum = int1 + int2;

        System.out.println("The Sum of " + int1 + " and " + int2 + " is: " + sum);
        System.out.println(sum);
    }
}
