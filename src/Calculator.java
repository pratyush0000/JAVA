import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ans = 0;

        System.out.println("Welcome to Calculator");
        System.out.println("(program can be exited by entering X)");
        System.out.println();

        while(true){
            System.out.println("Run the program: Y/N");
            char bool = input.next().trim().charAt(0);
            if (bool == 'Y') {
                System.out.print("Enter the Operator: ");
                char op = input.next().trim().charAt(0);

                if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {

                    System.out.println("enter 1st number");
                    int num1 = input.nextInt();

                    System.out.println("enter 2nd number");
                    int num2 = input.nextInt();

                    if (op == '+') {
                        ans = num1 + num2;
                    } else if (op == '-') {
                        ans = num1 - num2;
                    } else if (op == '*') {
                        ans = num1 * num2;
                    } else if (op == '/') {
                        ans = num1 / num2;
                    } else if (op == '%') {
                        ans = num1 % num2;
                    }
                }
                else {
                    System.out.println("Wrong operator chosen");
                    System.out.println("Options available: + , - , * , / , %");
                    break;
                }
                System.out.println("your answer is: " + ans);
            }
            else if (bool == 'N') {
                System.out.println("Exiting the program...");
                break;
            }
            else {
                System.out.println("Wrong option! Rerun program.");
                break;
            }
        }
    }
}