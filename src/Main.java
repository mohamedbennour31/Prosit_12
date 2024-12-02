import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.Comparator;
import java.util.stream.Collectors;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Alice", 22));
        students.add(new Student(2, "Bob", 21));
        students.add(new Student(3, "Charlie", 23));

        StudentManagement management = new StudentManagement();

        System.out.println("Tous les étudiants:");
        management.displayStudents(students, student -> System.out.println(student));


        System.out.println("\nÉtudiants de plus de 21 ans:");
        management.displayStudentsByFilter(students, student -> student.getAge() > 21, student -> System.out.println(student));


        String names = management.returnStudentsNames(students, student -> student.getNom());
        System.out.println("\nNoms des étudiants: " + names);


        Student newStudent = management.createStudent(() -> new Student(4, "David", 24));
        System.out.println("\nNouvel étudiant créé: " + newStudent);

        List<Student> sortedStudents = management.sortStudentsById(students, Comparator.comparingInt(Etudiant::getId));
        System.out.println("\nÉtudiants triés par ID:");
        sortedStudents.forEach(student -> System.out.println(student));

        System.out.println("\nÉtudiants de plus de 21 ans via Stream:");
        management.convertToStream(students)
                .filter(student -> student.getAge() > 21)
                .forEach(student -> System.out.println(student));
    }
    }
}