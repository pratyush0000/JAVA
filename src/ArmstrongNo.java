import java.util.Scanner;

public class ArmstrongNo {
    public static void main(String[] args) {
        Scanner arm=new Scanner(System.in);
        System.out.print("Enter Number to check for Armstrong: ");
        int num = arm.nextInt();
        boolean ans = isArmstrong(num);
        System.out.println(ans);
    }
    static boolean isArmstrong(int n){
        int original=n;
        int sum=0;
        while(n>0){
            int rem = n%10;
            int cube = rem*rem*rem;
            sum+=cube;
            n=n/10;
        }
        return sum==original;
    }
}
