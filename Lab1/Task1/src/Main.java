public class Main
{
    public static void main(String[] args)
    {
        Monitor m1 = new Monitor("Yellow", "14x19", "1920x960");

        System.out.println(m1.toString());

        m1.setDimensions("99x22");
        m1.setColor("Red");
        m1.setResolution("1992x1992");
        System.out.println(m1.toString());
        Monitor m2 = new Monitor("Red", "20x12", "1440x480");

        System.out.println(m1.equals(m2));

        m1.setResolution("1440x480");
        m1.setDimensions("20x12");
        m1.setColor("Red");
        System.out.println(m1.toString());
        System.out.println(m2.toString());
        System.out.println(m1.equals(m2));
    }
}
