public class B extends A{
    public String b;

    public B(String a, String b)
    {
        super(a);
        this.b=b;
    }
    @Override  public String toString(){
        return "B{" + "b=" + b + ' ' + "a=" + a +"}\n";}
}
