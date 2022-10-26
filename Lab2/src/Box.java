public class Box
{
    public int height;
    public int width;
    public int depth;

    public Box(){
        height= 1;
        width=1;
        depth=1;
    }
    public Box(int n){
        height=n;
        width=n;
        depth=n;
    }

    public Box(int height, int width, int depth)
    {
        this.height = height;
        this.width = width;
        this.depth = depth;
    }
    public float findVolume(){
        return this.height * this.depth * this.width;
    }
    public float findSurfaceArea(){
        return  (2*(this.height * this.width))+(2*(this.height*this.depth))+(2*(this.width*this.depth));
    }

    @Override
    public String toString()
    {
        return  height + " " + width + " " + depth;
    }
}
