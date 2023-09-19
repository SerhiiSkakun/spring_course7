package aop.aspects;

import aop.Student;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {

    @Before("execution(* getStudents())")
    public void beforeGetStudentsLoggingAdvice() {
        System.out.println("beforeGetStudentsLoggingAdvice: Логируем получение списка студентов перед методом getStudents");
        System.out.println("--------------------------------------------------------");
    }

    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(List<Student> students) {
        Student firstStudent = students.get(0);
        firstStudent.setNameSurname("Mr. " + firstStudent.getNameSurname());
        firstStudent.setAvgGrade(firstStudent.getAvgGrade() + 1);
        System.out.println("afterReturningGetStudentsLoggingAdvice: Логируем получение списка студентов после метода getStudents");
        System.out.println("--------------------------------------------------------");
    }

    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "throwable")
    public void afterTrowingGetStudentsLoggingAdvice(Throwable throwable) {
        System.out.println("afterTrowingGetStudentsLoggingAdvice: Логируем выброс исключения после метода getStudents");
        System.out.println("Было поймано исключение: " + throwable);
        System.out.println("--------------------------------------------------------");
    }

    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice() {
        System.out.println("afterGetStudentsLoggingAdvice: Логируем получение списка студентов после метода getStudents");
        System.out.println("--------------------------------------------------------");
    }
}
