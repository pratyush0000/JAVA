import java.util.Scanner;

public class ReturnType {
    public static void main(String[] args) {
        String greeting = greeting();
        System.out.println(greeting);
    }
    static String greeting(){
        System.out.println("Language:");
        System.out.println("1. English");
        System.out.println("2. Hindi");
        System.out.println("3. Spanish");
        System.out.println("4. Japanese");

        Scanner lan = new Scanner(System.in);
        int language = lan.nextInt();
        String greet;

        switch (language){
            case 1 :
                greet = "Hello";
                break;
            case 2 :
                greet = "नमस्ते";
                break;
            case 3 :
                greet = "Hola";
                break;
            case 4 :
                greet = "こんにちは";
                break;
            default:
                greet = "wrong option";

        }
        return greet;
    }
}
