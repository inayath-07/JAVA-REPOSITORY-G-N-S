package LogarithmPackages;

public class VarialeBaseLogarithm
{
    public double variableBase(int base,int N) //by means of common logarithm
    {
        double x = Math.log10(N)/Math.log10(base); //for working see pg 1.7 from math 1st sem
        return x;
    }    
}