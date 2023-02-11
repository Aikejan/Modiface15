import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

    Student student = new Student();
    student.setAge(25);
    student.setDate(LocalDate.of(1985,6,7));
    student.setFirstname("Veranica");
    student.setLastname("Kulikova");
    student.setEmail("VeraKulikova44@gmail.com");

       Student student1 = new Student();
       student1.setAge(30);
       student1.setDate(LocalDate.of(1975,6,4));
        student1.setFirstname("Alina");
        student1.setLastname("Pirogova");
        student1.setEmail("Alinapirogova89@gmail.com");
        Student [] students={student1,student};


    Groub groub= new Groub();
    groub.setCrub("Java-9");
    groub.setDate(LocalDate.of(2023,1,3));
    groub.setStudents(students);

    Groub groub1 =  new Groub();
    groub1.setCrub("JS");
    groub1.setDate(LocalDate.of(2020,3,6));
    groub1.setStudents(students);
    Groub [] groubs = {groub,groub1};

    Curs curs = new Curs();
    curs.setCursName("Java");
    curs.setDate(LocalDate.of(2020, 3,5));
    curs.setName("Samat");
    curs.setLastname("Chegirova");
    curs.setGroubs(groubs);
        System.out.println(curs.toString());





    }
}