import java.util.ArrayList;
import java.util.Date;

public abstract class Person {
    String title;
    String givenName;
    String middleName;
    String familyName;
    FullName name;
    Date birthDate;
    Gender gender;
    Address homeAddress;
    Phone phone;
    ArrayList<Hospital> hospitals;

}
