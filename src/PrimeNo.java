import java.util.Scanner;

public class PrimeNo {
    public static void main(String[] args) {
        System.out.print("enter number to check: ");
        Scanner num = new Scanner(System.in);
        int prim = num.nextInt();
        boolean ans = isPrime(prim);
        System.out.println(ans);
    }

    static boolean isPrime(int n){
        if(n<=1){
            return false;
        }
        int c=2;
        while(c*c<n){
            if(n%c==0){
                return false;
            }
            c++;
        }
        return c*c>n;
    }
}
