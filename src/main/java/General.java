public class General {

    public static void main(String[] args) {

        Student student = new Student("man", "Tom", 20, JobType.STUDENT, 5);
        System.out.println(student);
        student.learn();

        Schoolchild.calculator(1,2);


    }
}
