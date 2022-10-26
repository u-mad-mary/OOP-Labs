import java.util.ArrayList;
import java.util.Date;

public class Patient extends Person{
    String id;
    int age;
    Date accepted;
    History sickness;
    String[] prescriptions;
    String[] allergies;
    String[] specialReqs;
    ArrayList<OperationsStaff> operationsStaff;
}
