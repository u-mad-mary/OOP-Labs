public class I extends H{
    public String i;

    public I(String a, X x)
    {
        super(a,x);
        this.i=a;
    }
    @Override  public String toString(){
        return "I{" + "i=" + i + "}\n"+ super.toString();}
}