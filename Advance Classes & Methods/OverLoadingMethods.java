/* Overloading methods which are present in a same class -- it will
* find gst of a number 
*/

import java.util.Scanner;

class Overloading
{
    public int price;
    public int GST;

    Scanner in = new Scanner(System.in);

    //it will initialize variables
    public void toFindGST()
    {
        System.out.print("enter your price :");
        price = in.nextInt();
    }

    //It will calculate GST 
    public void toFindGST(int GST)
    {
        System.out.print("enter the percentage of gst :");
        GST = in.nextInt();

        //calculating GST
        GST =(price/100)*GST;
        System.out.println("The tax you have to pay is :"+GST);
    }
}

public class OverLoadingMethods
{
    public static void main(String[] args)
    {
        Overloading O = new Overloading();
        O.toFindGST();
        O.toFindGST(0);
    }
}

/*formula to find GST (Price/100)*gst */