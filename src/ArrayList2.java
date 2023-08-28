import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> list2 = new ArrayList<>(3);

        for(int i=0; i<5; i++){
            list2.add(in.nextInt());
        }

        //getting one item
        

        System.out.println(list2);
    }
}
