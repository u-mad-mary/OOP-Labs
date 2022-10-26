public class C extends B{
    public String c;

    public C(String a, String b, String c)
    {
        super(a,b);
        this.c=c;
    }
    @Override  public String toString(){
        return "C{" + "c=" + c + ' ' + "b=" + b + ' ' + "a=" + a +"}\n";}
}