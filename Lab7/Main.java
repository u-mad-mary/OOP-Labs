import java.util.ArrayList;

public class Main{

    public static void main(String[] args){

        Figure square = new Square(3);
        Figure rectangle = new Rectangle(3,4);
        Figure triangle = new Triangle(3,6,9);

        ArrayList<Figure> figures = new ArrayList<>();

        figures.add(square);
        figures.add(rectangle);
        figures.add(triangle);

        System.out.println();
        System.out.println("The figure with biggest perimeter is " + FigureController.biggestPerimeter(figures));
        System.out.println("The figure with biggest area is "+ FigureController.biggestArea(figures));

        Figure circle = new Figure(){

            double radius = 20.09;

            @Override
            public double getArea(){
                return Math.PI*radius*radius;
            }

            @Override
            public double getPerimeter(){
                return 2*Math.PI*radius;
            }

            @Override
            public String toString(){
                return "Circle{" +"radius=" + radius +"}";
            }

        };

        System.out.println();
        System.out.println("Circle's perimeter is " + circle.getPerimeter() + " cm");
        System.out.println("Circle's area is " + circle.getArea()+ " cm^2");

        figures.add(circle);

        System.out.println();
        System.out.println("The figure with biggest area is "+ FigureController.biggestArea(figures));
    }
}