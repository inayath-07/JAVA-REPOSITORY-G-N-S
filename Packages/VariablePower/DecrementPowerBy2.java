package VariablePower;

public class DecrementPowerBy2
{
    public double decBy2(double num,int till)
    {
        double res = 1;
        for(int i = 1;i<=till;i++)
        {
            res *= Math.pow(num, i/2);
        }
        return -res;
    }    
}