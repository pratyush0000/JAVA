import java.util.Scanner;

public class AllArmstrongNo {
    public static void main(String[] args) {
        Scanner arm = new Scanner(System.in);
        System.out.print("Enter Number before which all armstrong numbers will be printed:");
        int num = arm.nextInt();
        for(int i = 0; i<num ; i++){
            if(allArm(i)){
                System.out.println(i);
            }
        }
    }
    static boolean allArm(int n){

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
