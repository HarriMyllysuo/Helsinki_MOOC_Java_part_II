
import java.util.ArrayList;
import java.util.List;
import people.Person;
import people.Student;
import people.Teacher;

public class Main {
    
    public static void printDepartment(List<Person> people) {
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }
    }

    public static void main(String[] args) {
        // test your code here

        // Exercise 29.1: Person
        /* Person pekka = new Person("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa");
        Person esko = new Person("Esko Ukkonen", "Mannerheimintie Street 15 00100 Helsinki");
        System.out.println(pekka);
        System.out.println(esko); */
        
        // Exercise 29.2: Student
        /* Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        System.out.println("credits: " + olli.credits());
        olli.study();
        System.out.println("credits: " + olli.credits()); */
        
        // Exercise 29.3: toString for Students
        /* Student olli = new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki");
        System.out.println(olli);
        olli.study();
        System.out.println(olli); */
        
        // Exercise 29.4: Teacher
        /* Teacher pekka = new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200);
        Teacher esko = new Teacher("Esko Ukkonen", "Mannerheimintie 15 Street 00100 Helsinki", 5400);
        System.out.println(pekka);
        System.out.println(esko);
        for (int i = 0; i < 25; i++) {
            olli.study();
        }
        System.out.println(olli); */
        
        // Exercise 29.5: Everyone in a List
        List<Person> people = new ArrayList<Person>();
        people.add( new Teacher("Pekka Mikkola", "Korsontie Street 1 03100 Vantaa", 1200) );
        people.add( new Student("Olli", "Ida Albergintie Street 1 00400 Helsinki") );
        
        printDepartment(people);
    }
}
