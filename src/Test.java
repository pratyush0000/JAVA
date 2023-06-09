import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        System.out.println("Enter the numbers you want to add (2-3)");
        Scanner num = new Scanner(System.in);


        System.out.print("Enter 1st number: ");
        int a=num.nextInt();

        System.out.print("Enter 2nd number: ");
        int b=num.nextInt();

        System.out.println("Do you want to enter another number? Y/N");
        int c;
        String ques = num.next();
        switch (ques){
            case "Y":
                System.out.println("Enter 3rd number:");
                c = num.nextInt();
                break;
            case "N":
                c=0;
                break;
            default:
                System.out.println("wrong option");
                System.out.println("adding the 2 numbers...");
                c=0;
                break;
        }
        sum(a,b,c);
    }

    static void sum(int a,int b,int c){
        int add = a+b+c;
        System.out.println(add);
    }
}
