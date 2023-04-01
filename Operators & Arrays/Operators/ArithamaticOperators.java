/*This program will perfrom arithamatic operations on GST(Source 
 * 10 Maths)
 * 
 * Goods & Service Tax(G.S.T) --- chapter 1
 * 
 * just finds GST
*/

import java.util.Scanner;

public class ArithamaticOperators
{
    public static void main(String args[])
    {
        //creadting SCANNER OBJECTS
        Scanner in = new Scanner(System.in);

        //declaration of variables
        int price,GST_Rate;
        double Result;

        System.out.println("---\"Arithamatic operators ~ THE G.S.T\"---");
        
        System.out.print("enter price :");
        price = in.nextInt();
        
        System.out.print("enter GST rate :");
        GST_Rate = in.nextInt();

        //calculating for GST / & *
        Result = (price/100)*GST_Rate;//here 2 arithamatic operator are used / & *

        System.out.println("The GST to be paid is "+Result);


        System.out.println("----------------------------");
        System.out.println("---- for Discount ---");

        //declaration of variable
        int G$T_Rate,Price,Discount,Discount_Rate;
        double Re$ult,Price_To_pay;

        System.out.print("enter price :");
        Price = in.nextInt();

        System.out.print("enter GST rate :");
        G$T_Rate = in.nextInt();

        System.out.print("enter Discount :");
        Discount_Rate = in.nextInt();

        //calculating *, /, -, & +
        Discount = (Price/100)*Discount_Rate;
        Price_To_pay = Price - Discount;
        Re$ult = (Price/100)*G$T_Rate;
        System.out.println("the GST to be paid is "+Re$ult);
        System.out.println("the total price to pay is "+(Price_To_pay+Re$ult));

        System.out.println("----------------------------");

        //finding if the number is even or odd
        int num;
        System.out.println("enter number");
        num = in.nextInt();

        if(num%2==0)
        System.out.println("it is even number ");
        else
        System.out.println("it is odd");
        //all closing statements
        in.close(); 
    }
}