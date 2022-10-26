public class E extends D{
    public String e;

    public E(String a, X x)
    {
        super(a,x);
        this.e=a;
    }
    @Override  public String toString(){
        return "E{" + "e=" + e + ' '+ "x=" + x +"}\n"+ super.toString();}
}