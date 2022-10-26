public class Parallelepiped implements GeometricBody {

    double length;
    double width;
    double height;


    public Parallelepiped( double length, double width, double height){

        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getLength(){return length;}

    public void setLength(double Length){this.length = length;}

    public double getHeight(){return height;}

    public void setHeight(double height){this.height = height;}

    public double getWidth(){return width;}

    public void setWidth(double width){this.width = width;}

    @Override
    public double getSurface(){ return 2*length*width+2+length*height+2*width*height;}

    @Override
    public double getVolume(){ return length*width*height;}

    @Override
    public String toString(){return "Parallelepiped{" + "length=" + length +", width=" + width + ", height =" + height+"}";}
}
