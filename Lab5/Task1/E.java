public class E extends D{
    public String e;

    public E(String a, String b, String c, String d, String e)
    {
        super(a,b,c,d);
        this.e=e;
    }
    @Override  public String toString(){
        return "E{" + "e=" + e + ' '+ "d=" + d + ' ' + "c=" + c + ' '+ "b=" + b + ' ' + "a=" + a +"}\n";}
}