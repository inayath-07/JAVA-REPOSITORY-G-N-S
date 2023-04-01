enum MathConst
{
    PIE(Math.PI),
    E(Math.E);

    final double Value;
    MathConst(double Value)
    {
        this.Value = Value;
    }
}
public class ValueMethod
{
    public static void main(String[] args)
    {
        System.out.println("---\"The Enumeration\"---");

        for(MathConst X : MathConst.values())
        {
            System.out.println("The value of "+X+" is "+X.Value);
        }
    }    
}