package Subpackage;

public class MilliSec1970
{
    public void howMany1970()
    {
        long millisec_since_1970 = System.currentTimeMillis();

        System.out.println("the number of millisec since 1970 "+millisec_since_1970);

        millisec_since_1970 = millisec_since_1970/1000;
        System.out.println("The number of sec scine 1970 "+millisec_since_1970);

        millisec_since_1970 = millisec_since_1970/3600;
        System.out.println("the number of miniutes since 1970"+millisec_since_1970);

        millisec_since_1970 = millisec_since_1970/24;
        System.out.println("the number of days scince "+millisec_since_1970);

        millisec_since_1970 = millisec_since_1970/365;
        System.out.println("teh number of years since 1970 "+millisec_since_1970);
    }
}