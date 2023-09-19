package home_task_1_OOP;

public class Schoolchild extends People implements Learnable {
    public Schoolchild(String sex, String name, int age, JobType job) {
        super(sex, name, age, job);
    }

    @Override
    public void learn() {
        System.out.println("I learn painting in a school");
    }

    @Override
    public String toString() {
        return "home_work_1.Schoolchild{" + super.toString() + "}";
    }
}
