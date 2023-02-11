import java.time.LocalDate;
import java.util.Arrays;

public class Groub {
    private String crub;
    private LocalDate date;
    private  Student[] students;
    public Groub(){
    }

    public Groub(String crub, LocalDate date, Student[] students) {
        this.crub = crub;
        this.date = date;
        this.students = students;
    }

    public String getCrub() {
        return crub;
    }

    public void setCrub(String crub) {
        this.crub = crub;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "\n \n Groub:" +
                "\n crub: " + crub +
                " \n date: " + date +
                " \n students: " + Arrays.toString(students);
    }
}
