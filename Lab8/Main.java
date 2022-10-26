import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        GeometricBody cube = new Cube(3);
        GeometricBody parallelepiped = new Parallelepiped(10,3,7);
        GeometricBody sphere = new Sphere(3);

        ArrayList<GeometricBody> geometricBodies = new ArrayList<>();

        geometricBodies.add(cube);
        geometricBodies.add(parallelepiped);
        geometricBodies.add(sphere);

        System.out.println();
        System.out.println("The geometric body with biggest surface is " + GeometricBodyController.biggestSurface(geometricBodies));
        System.out.println("The geometric body with biggest volume is "+ GeometricBodyController.biggestVolume(geometricBodies));

    }
}