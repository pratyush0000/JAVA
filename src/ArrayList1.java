import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 = new ArrayList<>(3);

        list1.add(232);
        list1.add(23);
        list1.add(2342);
        list1.add(2);
        list1.add(24232);
        list1.add(2546);

        //if it contains the int
        System.out.println(list1.contains(24232));

        System.out.println(list1);

        //updating
        list1.set(0,748);
        System.out.println(list1);

        //removing
        list1.remove(2);
        System.out.println(list1);
    }
}
