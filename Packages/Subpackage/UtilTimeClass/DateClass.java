package Subpackage.UtilTimeClass;

import java.util.Date;

public class DateClass
{
    @SuppressWarnings("depricated")
    public void dateMethod(int year,int month,int date,int hrs,int min,int sec,int milli)
    {
        year -=1970; 
        month -=1;

        Date D = new Date();


        System.out.println("all info about today's date "+D);

        //Depricated Constructors
        // Date D1 = new Date(year,month,date);
        // System.out.println(D1);

        // Date D2 = new Date(year,month,date,hrs,min);
        // System.out.println(D2);

        // Date D3 = new Date(year,month,date,hrs,min,sec);
        // System.out.println(D3);

        //Depricated Methods
        // System.out.println(D+"\t>\t"+D1+"\t"+D.after(D1));
        // System.out.println(D+"\t<\t"+D1+"\t"+D1.after(D));
        // System.out.println(D.compareTo(D3));
    }
}