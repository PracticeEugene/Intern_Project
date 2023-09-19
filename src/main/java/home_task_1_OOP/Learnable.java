package home_task_1_OOP;

public interface Learnable {
    void learn();

    default void read() {
        System.out.println("I read book!");
    }
}
