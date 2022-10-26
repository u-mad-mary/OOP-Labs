public class H extends G{
    public String h;
    private X x = new X("I like");

    public H(String a, X x)
    {
        super(a,x);
        this.h=a;
    }
    @Override  public String toString(){
        return "H{" + "h=" + h + ' '+ "x=" + x +"}\n"+ super.toString();}
}