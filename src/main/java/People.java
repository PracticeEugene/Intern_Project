public abstract class People {
    private final String sex;
    private final String name;
    private final int age;
    private final JobType jobb;

    public People(String sex, String name, int age, JobType job) {
        this.sex = sex;
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return  "sex='" + sex + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", job=" + job + ", ";
    }
}
