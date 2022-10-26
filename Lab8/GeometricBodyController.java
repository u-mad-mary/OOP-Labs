import java.util.ArrayList;

public class GeometricBodyController {
    public static GeometricBody biggestSurface(ArrayList<GeometricBody> geometricBodies){
        
        GeometricBody biggestGeometricBody = geometricBodies.get(0);
        for (GeometricBody geometricBody : geometricBodies){
            if(biggestGeometricBody.getSurface()< geometricBody.getSurface())
                biggestGeometricBody = geometricBody;
        }
        return biggestGeometricBody;
    }

    public static GeometricBody biggestVolume(ArrayList<GeometricBody> geometricBodies){

        GeometricBody biggestGeometricBody = geometricBodies.get(0);
        for (GeometricBody geometricBody : geometricBodies){
            if(geometricBody.getVolume() < geometricBody.getVolume())
                biggestGeometricBody = geometricBody;
        }
        return biggestGeometricBody;
    }
}
