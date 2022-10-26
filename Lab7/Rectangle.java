public class Rectangle extends Figure{

    double length;
    double width;

    public Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    public double getLength(){
        return length;
    }

    public void setLength(double length){
        this.length = length;
    }

    public double getWidth(){
        return width;
    }

    public void setSide(double width){
        this.width = width;
    }

    @Override
    public double getArea(){
        return length*width;
    }

    @Override
    public double getPerimeter(){
        return (length+width)*2;
    }

    @Override
    public String toString(){
        return "Rectangle{" + "length=" + length +", width=" + width + "}";
    }
}