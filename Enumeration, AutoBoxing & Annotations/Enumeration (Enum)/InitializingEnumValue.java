//Initializing values to enum
enum ConstSpeed
{
    LIGHT(299792458),
    SOUND(343),
    COSMICRAYS(299792457.9999999999999992);

    final double Speed;

    //creating constructor to initialize
    ConstSpeed(double Speed)
    {
        this.Speed = Speed;
    }
}
public class InitializingEnumValue
{
    public static void main(String[] args)
    {
        System.out.println("The speed of light is "+ConstSpeed.LIGHT.Speed);
        System.out.println("The speed of sound is "+ConstSpeed.SOUND.Speed);
        System.out.println("The speed of cosmic rays is "+ConstSpeed.COSMICRAYS.Speed);
    }    
}
