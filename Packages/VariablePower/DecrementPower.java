package VariablePower;

public class DecrementPower
{
    public double decPow(double num,int till)
    {
        double res = 1;
        for(int i = 1;i>=-till;i--)
        {
            res *= Math.pow(num, i);
        }
        return res;
    }
}