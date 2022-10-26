public class D extends C{
    public String d;
    protected X x = new X("chocolate");

    public D(String a, X x)
    {
        super(a,x);
        this.d=a;
    }
    @Override  public String toString(){
        return "D{" + "d=" + d + ' ' + "x=" + x +"}\n"+ super.toString();}
}