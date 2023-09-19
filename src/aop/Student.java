package aop;

public class Student {
    private String nameSurname;
    private int age;
    private double avgGrade;

    public Student(String nameSurname, int age, double avgGrade) {
        this.nameSurname = nameSurname;
        this.age = age;
        this.avgGrade = avgGrade;
    }

    public String getNameSurname() {
        return nameSurname;
    }

    public void setNameSurname(String nameSurname) {
        this.nameSurname = nameSurname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getAvgGrade() {
        return avgGrade;
    }

    public void setAvgGrade(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "nameSurname='" + nameSurname + '\'' +
                ", age=" + age +
                ", avgGrade=" + avgGrade +
                '}';
    }
}
