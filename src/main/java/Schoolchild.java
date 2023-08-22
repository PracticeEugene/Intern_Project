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
        return "Schoolchild{" + super.toString() + "}";
    }
}
