import java.util.Scanner;

public class Switch1 {
    public static void main(String[] args) {
        Scanner str = new Scanner(System.in);
        System.out.println("Fav Fruit?");
        String fruit = str.next();


        switch (fruit){
            case "Mango":
                System.out.println("King of fruits");
                break;
            case "Banana":
                System.out.println("long");
                break;
            case "Apple":
                System.out.println("red");
                break;
            case "blueberry":
                System.out.println("blue");
                break;
            case "Orange":
                System.out.println("Round");
                break;
            default:
                System.out.println("bad choice");
        }
    }
}
