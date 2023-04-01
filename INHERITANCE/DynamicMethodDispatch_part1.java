/*Dynamic Method Dispatch by means of Code with harry Method  
 * SuperClass ob = new SuperClass();
 * 
 * Advantage
 * by this the object of superclass can refere to all member(except private)
 * of sub class
*/

class PIE
{
    final double pi_value = Math.PI;
   PIE()
    {
        System.out.println("the value of pi is "+pi_value);
    }
}

class E extends PIE
{
    double e = Math.E;

    E()
    {
        System.out.println("the value of e is "+e);
    }    
}
public class DynamicMethodDispatch_part1
{
    public static void main(String[] args)
    {
        System.out.println("---\"Dynamic Method Dispatch \"---");

        //implementation of dynamic method dispatch
        PIE P = new PIE(); //only implements constructor of PIE CLASS
        P = new E();//will implemenst constructor of E & PIE

        System.out.println("the class of P is "+P.getClass());
    }
}