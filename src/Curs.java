import java.time.LocalDate;
import java.util.Arrays;

public class Curs {
    private String cursName;
    private LocalDate date;
    private String name;
    private String lastname;
    private Groub[] groubs;

    public Curs() {

    }

    public Curs(String cursName, LocalDate date, String name, String lastname, Groub[] groubs) {
        this.cursName = cursName;
        this.date = date;
        this.name = name;
        this.lastname = lastname;
        this.groubs = groubs;
    }

    public String getCursName() {
        return cursName;
    }

    public void setCursName(String cursName) {
        this.cursName = cursName;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public Groub[] getGroubs() {
        return groubs;
    }

    public void setGroubs(Groub[] groubs) {
        this.groubs = groubs;
    }

    @Override
    public String toString() {
        return "\n \n Curs:" +
                "\n cursName: " + cursName +
                " \n date: " + date +
                "\n  name: " + name +
                " \n lastname: " + lastname +
                " \n groubs: " + Arrays.toString(groubs);
    }
}


