/*This program will demonstrate the use of static 
 * over method 
 * Note that:
 * it's memory allocation is same as static variable
 * and can access only static members 
 * cannot invoke this and super
*/

class StaticUseForMethod
{
    static void singleMemoryAllocation() // --according to present Knowladge 
    /*
     * we cannot use Object to call static Method
     */
    {
       System.out.println("i will allocated ones for a muliple object");
    }
}
public class StaticMethod
{
    public static void main(String[] args)
    {
        System.out.println("---\"StaticKeyword02.main()\"---");
        StaticUseForMethod.singleMemoryAllocation();
    }
}