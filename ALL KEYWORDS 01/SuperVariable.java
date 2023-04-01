/*The program to demonstrate super keyword wit respect to 
variable */

class SuperVariableDemonstration
{
    int pin = 20;
}
class ExtendingSVD  extends SuperVariableDemonstration
{
    ExtendingSVD()
    {
        System.out.println("your pin is "+super.pin);
    }    
}
public class SuperVariable
{
    public static void main(String[] args)
    {
        System.out.println("---\"SuperVariable.main()\"---");
        
        @SuppressWarnings("unused")
        ExtendingSVD ESVD = new ExtendingSVD();
    }    
}