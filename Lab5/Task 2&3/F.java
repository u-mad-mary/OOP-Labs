public class F extends E{
    public String f;

    public F(String a, X x)
    {
        super(a,x);
        this.f=a;
    }
    @Override  public String toString(){
        return "F{" + "f=" + f + ' '+ "x=" + x +"}\n"+ super.toString();}
}