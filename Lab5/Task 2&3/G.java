public class G extends F{
    public String g;

    public G(String a, X x)
    {
        super(a,x);
        this.g=a;
    }
    @Override  public String toString(){
        return "G{" + "g=" + g + ' '+ "x=" + x +"}\n"+ super.toString();}
}