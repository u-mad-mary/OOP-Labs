public class Triangle extends Figure
{
    double sideA;
    double sideB;
    double sideC;

    public Triangle(double sideA, double sideB, double sideC){

        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    public double getSideA(){
        return sideA;
    }

    public void setSideA(double sideA){
        this.sideA = sideA;
    }

    public double getSideB(){
        return sideB;
    }

    public void setSideB(double sideB){
        this.sideA = sideB;
    }

    public double getSideC(){
        return sideC;
    }

    public void setSideC(double sideC){
        this.sideC = sideC;
    }

    @Override
    public double getArea(){
        double semiPerimeter = getPerimeter() / 2;
        return Math.sqrt(semiPerimeter * (semiPerimeter - sideA) * (semiPerimeter - sideB) * (semiPerimeter - sideC));
    }

    @Override
    public double getPerimeter(){
        return sideA + sideB + sideC;
    }

    @Override
    public String toString(){
        return "Triangle{" + "sideA=" + sideA + ", sideB=" + sideB + ", sideC=" + sideC + "}";
    }
}