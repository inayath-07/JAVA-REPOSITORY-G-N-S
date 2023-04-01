public class Adding2Numbers<T extends Number> // here the number is known as Bounding type
{
    T num;
    T num2;
    void Sum(T num,T num2)
    {
        this.num = num;
        this.num2 = num2;

        System.out.println(num.byteValue()+num2.byteValue());
    }
    public static void main(String[] args)
    {
        System.out.println("---\"Adding2Numbers.main()\"---");
        Adding2Numbers<Float> A2N = new Adding2Numbers<>();
        A2N.Sum(10.5F, 56.3F);
    }
}