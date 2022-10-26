public class Student
{
    private String name;
    private int age;
    private int mark;

    public Student(String name, int age, int mark)
    {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getAge()
    {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    public int getMark()
    {
        return mark;
    }

    public void setMark(int mark)
    {
        this.mark = mark;
    }

    @Override public String toString()
    {
        return  name + ' ' +  age + " "
                + mark ;
    }
}
