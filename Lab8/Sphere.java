public class Sphere implements GeometricBody
{
    double radius;

    public Sphere(double radius){this.radius = radius;}

    public double getRadius(){return radius;}

    public void setRadius(double radius){this.radius = radius;}

    @Override
    public double getSurface(){ return 4 * Math.PI * radius * radius;}

    @Override
    public double getVolume(){return 4/3 * Math.PI * radius * radius * radius;}

    @Override
    public String toString(){ return "Sphere{" + "radius= " + radius + "}";}
}
