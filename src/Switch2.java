import java.util.Scanner;

public class Switch2 {
    public static void main(String[] args) {
        Scanner ans = new Scanner(System.in);
        System.out.println("Which day of the week?");
        String day = ans.next();

        switch (day){
            case "1" -> System.out.println("monday");
            case "2" -> System.out.println("tuesday");
            case "3" -> System.out.println("wednesday");
            case "4" -> System.out.println("thursday");
            case "5" -> System.out.println("friday");
            case "6" -> System.out.println("saturday");
            case "7" -> System.out.println("sunday");
        }
    }
}
