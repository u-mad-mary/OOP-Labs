public class C extends B{
    protected String c;

    public C(String a, X x)
    {
        super(a,x);
        this.c=a;
    }
    @Override  public String toString(){
        return "C{" + "c=" + c + ' ' + "x=" + x +"}\n"+ super.toString();}
}