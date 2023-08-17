public class Student extends People implements Learn {
    private final int countLessons;

    public Student(String sex, String name, int age, JobType job, int countLessons) {
        super(sex, name, age, job);
        this.countLessons = countLessons;
    }

    @Override
    public void learn() {
        System.out.println("I learn IT technologies in university");
    }

    @Override
    public String toString() {
        return "Student{" + super.toString() +
                "countLessons=" + countLessons +
                '}';
    }
}
