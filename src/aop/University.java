package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudents() {
        students.add(new Student("Student1", 4, 7.5));
        students.add(new Student("Student2", 2, 8.3));
        students.add(new Student("Student3", 1, 9.1));
    }

    public List<Student> getStudents() {
        System.out.println("Information from getStudents: ");
//        System.out.println(students.get(3)); //Throw Exception
        System.out.println(students);
        System.out.println("--------------------------------------------------------");
        return students;
    }
}
