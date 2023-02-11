import java.time.LocalDate;
import java.time.Period;

public class Student {
    private LocalDate date;
    private String firstname;
    private  String lastname;
    private String email;
    private int age;
    public Student(){

    }

    public Student(LocalDate date, String firstname, String lastname, String email) {
        this.date = date;
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.age = Period.between(date,LocalDate.now()).getYears();
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "\n  \n Student" +
                "\n date: " + date +
                " \n firstname: " + firstname +
                " \n lastname=: " + lastname +
                " \n email: " + email +
                " \n age: " + age;
    }
}
