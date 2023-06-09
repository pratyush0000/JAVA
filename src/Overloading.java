public class Overloading {
    public static void main(String[] args) {
        //same function name different args
        func(67);
        func("apple");
    }

    static void func(int a){
        System.out.println(a);
    }

    static void func(String name){
        System.out.println(name);
    }
}
