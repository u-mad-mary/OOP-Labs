public class D extends C{
    public String d;

    public D(String a, String b, String c, String d)
    {
        super(a,b,c);
        this.d=d;
    }
    @Override  public String toString(){
        return "D{" + "d=" + d + ' ' + "c=" + c + ' '+ "b=" + b + ' ' + "a=" + a +"}\n";}
}