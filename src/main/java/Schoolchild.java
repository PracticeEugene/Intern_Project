public class Schoolchild extends People implements Learn {
    public Schoolchild(String sex, String name, int age, JobType job) {
        super(sex, name, age, job);
    }

    public static int calculator(int a, int b) {
        return a + b;
    }

    @Override
    public void learn() {
        System.out.println("I learn painting in a school");
    }
}
