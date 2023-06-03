public class TypeCasting {
    public static void main(String[] args) {
        byte b =55;
        char c = 'a';
        int i = 5005;
        short s = 1234;
        float f = 56.32f;
        double d = 11.1234;
        double result = (f*b) + (i/c) + (d-s);
        System.out.println("(" + (f*b) + ") + (" + (i/c) + ") + (" + (d-s) + ")");
        System.out.println(result);
    }
}
