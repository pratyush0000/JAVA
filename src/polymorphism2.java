class Trees{
    String Name;
    String Color;
    int height;
    int circumference;

    public void printInfo(String Name){
        System.out.println("1 is working");
        System.out.println(this.Name);
    }


    public void printInfo(){
        System.out.println(this.Color + " " + this.height);
    }

    public void printInfo(int circumference){
        this.circumference=circumference;
        System.out.println(this.circumference);
    }

    Trees(String Colorzz, int height){
        this.Color=Colorzz;
        this.height=height;
    }
}

public class polymorphism2 {
    public static void main(String[] args) {
        Trees t1 = new Trees("green",3);
        t1.Name="jungle";
        t1.printInfo("OAK");
        t1.printInfo(10);
        t1.printInfo();
    }
}

