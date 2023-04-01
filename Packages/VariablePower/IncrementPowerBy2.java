package VariablePower;

public class IncrementPowerBy2
{
    public IncrementPowerBy2(double num,int till)
    {
        double res = 1;
        for(int i = 1;i<=till;i++)
        {
            res *= Math.pow(num, i*2);
        }

        System.out.println(res);
    }   
}