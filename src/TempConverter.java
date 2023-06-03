import java.util.Scanner;

public class TempConverter {
    public static void main(String[] args) {
        System.out.println("Welcome to Temprature Converter");
        System.out.println("Choose Option: ");
        System.out.println("1. Celcius to Farhenheit");
        System.out.println("2. Farhenheit to Celcius");

        Scanner ask = new Scanner(System.in);
        int option = ask.nextInt();
        if (option == 1){
            System.out.println("Enter Temprature in Celcius: ");
            float Cel1 = ask.nextInt();
            float Far1 = (Cel1*9/5)+32;
            System.out.println(Cel1 + "°C is the same as " + Far1 + "°F");
        }

        else if (option == 2) {
            System.out.println("Enter Temprature in Farhenheit: ");
            float Far2 = ask.nextInt();
            float Cel2 = (Far2-32)*5/9;
            System.out.println(Far2 + "°C is the same as " + Cel2 + "°F");
        }

        else{
            System.out.println("wrong option chosen! run program again");
        }
    }
}
