/*program to demonstratre this as per recursion */

class Recursion
{
    int num = 1;

    void print()
    {
        System.out.println((num)+".Syed Shah Inayath Ullah Quadri");
        
        if(num==10)
        {
            System.exit(0);
        }
        num++;
        this.print();
    }
}
public class ThisRecursion
{
    public static void main(String[] args)
    {
        System.out.println("ThisKeyword04.main()");
        Recursion R = new Recursion();
        R.print();
    }    
}