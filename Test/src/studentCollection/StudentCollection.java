package studentCollection;


import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import generator.RandomGenerator;
import student.Student;



public class StudentCollection {
    private ArrayList<Student> students;

    public StudentCollection() {
        students = new ArrayList<>();
    }

    public ArrayList<Student> getStudents(){
        return students;
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
           students.add(student);
        }
    }

    public void removeStudent(Student student) {
        if(students.contains(student)){
            students.remove(student);
        }
    }

    public void transitionNextCourse(){
        if(students.size() == 0){
            System.out.println("No students in the collection.");
            return;
        }
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()){
            Student student = iterator.next();
            if(student.getScore() >= 3){
                student.setCourse();
                student.setScore(RandomGenerator.generateNumber());
                
            }else{
                iterator.remove();
            }
            if(student.getCourse() == 7){
                iterator.remove();
            }
        }
    }

    public void printStudents(List<Student> students_, int course){
        if(students_.isEmpty()){
            System.out.println("No students in the collection.");
            return;
        }
        System.out.println("Students in course " + course + " : ");
        for(Student student : students_){
            if(student.getCourse() == course){
                System.out.println(student.getName() + " - " + student.getGroup() + " - " + student.getScore() + " - " + student.getCourse());
            }
        }
    }

    public void print(){
        if(students.isEmpty()){
            return;
        }
        System.out.println("All students : ");
        for(Student student : students){
            System.out.println(student.getName() + " - " + student.getGroup() + " - " + student.getScore() + " - " + student.getCourse());
        }
    }


}


