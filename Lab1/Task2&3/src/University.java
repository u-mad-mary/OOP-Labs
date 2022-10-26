import java.util.ArrayList;

public class University
{
    private String name;
    private Date foundationYear;
    private ArrayList<Student> students;

    public University(String name, Date foundationYear,
                      ArrayList<Student> students)
    {
        this.name = name;
        this.foundationYear = foundationYear;
        this.students = new ArrayList<Student>();
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Date getFoundationYear()
    {
        return foundationYear;
    }

    public void setFoundationYear(Date foundationYear)
    {
        this.foundationYear = foundationYear;
    }

    public int getStudentsMarkSum()
    {
        int sum =0;
        for (int i = 0; i < students.size(); i++)
        {
            sum+=students.get(i).getMark();
        }
        return sum;
    }

    public void addStudent(Student student)
    {
        students.add(student);
    }

    public void removeStudent(Student student)
    {
        students.remove(student);
    }

    @Override public String toString()
    {
        return "University " + "name " + name + '\'' + ", foundationYear="
                + foundationYear + ", students=" + students;
    }
}
