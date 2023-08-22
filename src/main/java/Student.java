import java.util.ArrayList;
import java.util.List;

public class Student extends People implements Learnable {
    public final int countLessons;

    public ArrayList<Student> listStudents = new ArrayList<>();

    public Student(String sex, String name, int age, JobType job, int countLessons) {
        super(sex, name, age, job);
        this.countLessons = countLessons;
    }

    public List<Student> addStudent(Student student) {
        listStudents.add(student);
        return listStudents;
    }

    public int studentWithMaxCountLessons(List<Student> listStudents) {
        int studentWithMaxCountLessons = 0;
        for (Student listStudent : listStudents) {
            if (studentWithMaxCountLessons < listStudent.countLessons) {
                studentWithMaxCountLessons = listStudent.countLessons;
            }
        }
        return studentWithMaxCountLessons;
    }

    public int calculate(int a, int b) {
        return a + b;
    }

    public int calculate(int a, int b, int c) {
        return a + b + c;
    }

    public static String concatenationStrings(String str1, String str2) {
        return str1 + str2;
    }

    @Override
    public void read() {
        Learnable.super.read();
    }

    @Override
    public void learn() {
        System.out.println("I learn IT technologies in university");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() + ", " +
                "countLessons=" + countLessons +
                '}';
    }
}
