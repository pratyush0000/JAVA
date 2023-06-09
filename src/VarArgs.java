import java.util.Arrays;

public class VarArgs {
    public static void main(String[] args) {
        func(2 ,5 ,6 ,7 ,8 ,8 ,6);//giving variable number of stings as args)

        mixed(2, 4, "a" , "f" , "fjeifjd" , "dofhs" , "apple");
    }
    static void func(int ...v){//asking for variable int args
        System.out.println(Arrays.toString(v));
    }

    static void mixed(int a, int b,String  ...p){//using mixed arguments, variable length arg has to be at the end
        System.out.println(Arrays.toString(p));
    }
}
