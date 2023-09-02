import java.util.ArrayList;
import java.util.Scanner;
public class StalinSort {

    public static ArrayList<Integer> stalin(int[] arr)
    {
        ArrayList<Integer> sta=new ArrayList<Integer>();
        int max=0;
        for(int i=0;i<arr.length;i++)
        {
            if(sta.isEmpty() || arr[i]>=max)
            {
                sta.add(arr[i]);
                max=arr[i];
            }

            else
            {
                System.out.println("----->" + arr[i] +" is now DED !!!!!");
                try
                {
                    Thread.sleep(1500);
                }

                catch(InterruptedException ex)
                {}
            }
        }

        return sta;
    }
    public static void main(String[] args) {
        System.out.println("How many integers do you want?");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();

        int[] arr = new int[n];

        System.out.print("Send them in : ");
        Scanner scan = new Scanner(System.in);
        for (int i=0; i < arr.length;i++){
            arr[i] = scan.nextInt();
        }


        ArrayList<Integer> list1=new ArrayList<Integer>();
        list1=stalin(arr);
        System.out.println("Survivors: " + list1);

    }
}
