import java.util.Scanner;

public class FuncSum {
    public static void main(String[] args) {
        sum();
    }

    static void sum(){
        Scanner add = new Scanner(System.in);
        System.out.println("Num 1 : ");
        int num1 = add.nextInt();
        System.out.println("Num 2 : ");
        int num2 = add.nextInt();
        int sum = num1+num2;
        System.out.println("Sum = " + sum);
    }
}
