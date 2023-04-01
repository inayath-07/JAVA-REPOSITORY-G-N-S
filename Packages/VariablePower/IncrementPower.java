package VariablePower;

public class IncrementPower
{
    public double IncPow(double num,int till)
    {
        double res = 1;
        for(int i = 1;i<=till;i++)
        {
            res *= Math.pow(num, i);
        }
        return res;
    }    
}