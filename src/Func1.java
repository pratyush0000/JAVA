import java.util.Arrays;

public class Func1 {
    public static void main(String[] args) {
        //creating an array
        int[] arr = {2 , 5 , 6 , 7 , 8 , 34};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] nums){
        //changing 1st term to 99
        nums[0] = 99;
    }
}
