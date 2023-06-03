import java.util.Scanner;

public class NthFibonacciNumOwn {
    public static void main(String[] args) {
        Scanner nth = new Scanner(System.in);
        System.out.println("Enter N to find Nth number of Fibonacci Sequence");
        int n = nth.nextInt();
        int c = 0;
        int a = 0;
        int b = 1;
        int count = 3;

        while(count<=n){
            c = a+b;
            a = b;
            b = c;
            count++;
        }
        System.out.println(n + "th number of the fibonacci sequence is: " + c);
    }
}