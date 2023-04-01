package Subpackage.UtilTimeClass;

import java.util.Calendar;//Calendar Class is an abstract class due to that you cannot create it's object
import java.util.TimeZone;

public class UtilCalendarClass
{
    public void calendarClassMethod()
    {
        //creating istance of Calendar Class in static way
        Calendar CC = Calendar.getInstance();
        System.out.println("we will follow "+CC.getCalendarType()+" Calendar");
        System.out.println("the time zone we follow is "+CC.getTimeZone().getID()); //getDefault will say your default time zone
        
        System.out.println("The current time is "+CC.getTime());

        //using add ()
        CC.add(Calendar.MONTH, -5);
        System.out.println("before 5 months "+CC.getTime());

        CC.add(Calendar.MONTH,20);
        System.out.println("after 20 months "+CC.getTime());

        CC.add(Calendar.YEAR,-1);
        System.out.println(CC.getTime());

        //changing time zone
        System.out.println("The changed Time zone is "+TimeZone.getTimeZone("Asia/Singapore").getID());
    }
}