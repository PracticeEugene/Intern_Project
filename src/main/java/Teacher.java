public class Teacher extends People {
    public Teacher(String sex, String name, int age, JobType job) {
        super(sex, name, age, job);
    }

    public class TeacherLesson {
        String languageLesson;
        String arithmeticLesson;

        public TeacherLesson(String languageLesson, String arithmeticLesson) {
            this.languageLesson = languageLesson;
            this.arithmeticLesson = arithmeticLesson;
        }
    }




}
