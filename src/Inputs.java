import java.util.Scanner;

public class Inputs {
    public static void main(String[] args) {
        //asking rollno
        System.out.print("what is your rollno: ");


        //taking input from user
        Scanner ask = new Scanner(System.in);
        //adding it into a variable
        int rollno = ask.nextInt();

        //printing it out
        System.out.println("your roll no. is " + rollno);
    }
}
