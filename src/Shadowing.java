public class Shadowing {
    static int x = 90;
    public static void main(String[] args) {

        System.out.println(x); //this will print 90


        int x=40; //this will shadow x= 90 in this block
        System.out.println(x); //this will print 40


        func();
    }
    static void func(){
        System.out.println(x);//this will print 90(does not fall under the local x=40 scope)
    }
}
