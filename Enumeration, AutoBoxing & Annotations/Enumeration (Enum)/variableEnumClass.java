enum VarValues
{
    APPLE(10.5f),
    MANGO(563.25f);

    float price;

    VarValues(float price)
    {
        this.price = price;
    }
}
public class variableEnumClass
{
    public static void main(String[] args)
    {
        System.out.println(VarValues.APPLE.price);
        System.out.println(VarValues.MANGO.price = 10);
    }    
}