import student.Student;
import studentCollection.StudentCollection;

public class Main {
  public static void main(String[] args) {
    StudentCollection sc = new StudentCollection();


    sc.addStudent(new Student("Alice", "A1", 1, 3.5f));
    sc.addStudent(new Student("Bob", "B2", 2, 2.5f));
    sc.addStudent(new Student("Charlie", "C3", 3, 4.0f));
    sc.addStudent(new Student("David", "D4", 4, 3.8f));

    System.out.println("Студенты до перевода:");
    sc.print();

    sc.transitionNextCourse();

    System.out.println("\nСтуденты после перевода:");
    sc.print();

    System.out.println("\nСтуденты на 2 курсе:");
    StudentCollection.printStudents(sc.getStudents(), 2);


    sc.removeStudent(new Student("Bob", "B2", 2, 2.5f));
    sc.transitionNextCourse();
    System.out.println("\nСтуденты после удаления:");
    sc.print();
  }
}
