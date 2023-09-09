class Tree{
    String Name;
    String Color;
    int height;
    int circumference;

    public void printInfo(String Name){
        System.out.println("1 is working");
    }

    public void printInfo(int length){
        System.out.println("2 is working");
    }
}

public class polymorphism1 {
    public static void main(String[] args) {
        Tree t1 = new Tree();
        t1.printInfo("OAK");
        t1.printInfo(10);
    }
}
