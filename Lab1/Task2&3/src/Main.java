import java.sql.SQLOutput;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {

        Student st1 = new Student("Emil Burdui", 38, 9);
        Student st2 = new Student("Maria Smirnov", 22, 10);
        Student st3 = new Student("Yurion Galan", 30, 8);
        Student st4 = new Student("Piter Majong", 20, 9);
        Student st5 = new Student("Hu Tao", 19, 10);
        Student st6 = new Student("Jhong Lee", 25, 9);

        ArrayList<Student> students = new ArrayList<>();
        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        Date date1 = new Date(1964, 1, 1);
        Date date2 = new Date(1991, 1, 1);
        Date date3 = new Date(1992, 1, 1);

        University uni1 = new University("UTM University", date1, students);
        uni1.addStudent(st1);
        uni1.addStudent(st2);
        University uni2 = new University("ASEM University", date2, students1);
        uni2.addStudent(st3);
        uni2.addStudent(st4);
        University uni3 = new University("ULIM University", date3, students2);
        uni3.addStudent(st5);
        uni3.addStudent(st6);




        System.out.println("Average media:" + (double)(uni1.getStudentsMarkSum()+uni2.getStudentsMarkSum()+uni3.getStudentsMarkSum())/6);

        System.out.println(uni1.toString());

        System.out.println(uni2.toString());

        System.out.println(uni3.toString());

    }
}
