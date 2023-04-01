class GenClass<T>
{
    T type;
    public void print()
    {
        System.out.println(type.getClass());
    }
}

public class SimpleProgramOnGenerics
{
    public static void main(String[] args)
    {
        System.out.println("---\"SimpleProgramOnGenerics.main()\"---");

        //creating object of GenClass
        GenClass<String> GC = new GenClass<>();
        GC.type = "Syed shah inayath ullah quadri";
        GC.print();
    }
}