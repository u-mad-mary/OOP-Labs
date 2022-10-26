import java.util.ArrayList;

public class FigureController{

    public static Figure biggestArea(ArrayList<Figure> figures){

        Figure biggestAreaFigure = figures.get(0);

        for (Figure figure: figures){

            if(biggestAreaFigure.getArea()<figure.getArea())
                biggestAreaFigure=figure;
        }

        return biggestAreaFigure;
    }

    public static Figure biggestPerimeter(ArrayList<Figure> figures){

        Figure biggestPerimeterFigure = figures.get(0);

        for (Figure figure: figures){

            if(biggestPerimeterFigure.getPerimeter()<figure.getPerimeter())
                biggestPerimeterFigure=figure;
        }

        return biggestPerimeterFigure;
    }
}