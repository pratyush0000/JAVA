import java.util.Scanner;

public class NthFibonacciNum {
    public static void main(String[] args) {
        Scanner nth = new Scanner(System.in);
        System.out.println("Enter N to find Nth number of Fibonacci Sequence");
        int n = nth.nextInt();

        int a = 0;
        int b = 1;
        int count = 3;

        while(count<=n){
            int temp = b;
            b = b + a;
            a= temp;
            count +=1;
        }
        System.out.println(n + "th number of the fibonacci sequence is: " + b);
    }
}
