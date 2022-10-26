public class G extends F{
    public String g;

    public G(String a, String b, String c, String d, String e,String f, String g)
    {
        super(a,b,c,d,e,f);
        this.g=g;
    }
    @Override  public String toString(){
        return "G{" + "g=" + g + ' '+ "f=" + f + ' '+ "e=" + e + ' '+ "d=" + d + ' ' + "c=" + c + ' '+ "b=" + b + ' ' + "a=" + a +"}\n";}
}