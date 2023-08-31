package home_work;

import java.util.*;

public class HomeWork {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);
        System.out.println(numbers);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Сумма всех уникальных чисел в листе:");
        System.out.println(numbers.stream().distinct().mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum());

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Сумма всех четных чисел в листе:");
        int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt((s) -> Integer.parseInt(String.valueOf(s))).sum();
        System.out.println(sum);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Количество повтерений числа в листе:");
        Map<Integer, Integer> counter = new HashMap<>();
        for (int x : numbers) {
            int newValue = counter.getOrDefault(x, 0) + 1;
            counter.put(x, newValue);
        }
        System.out.println(counter);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Вывод листа через лямда стримы:");
        numbers.forEach(System.out::print);
        //.forEach(numbers -> System.out.print(numbers));

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Сортировка работников по возрасту, все кто старше 20 лет:");
        List<Worker> workers = new ArrayList<>();
        workers.add(new Worker("Ivan", 22));
        workers.add(new Worker("Petr", 19));
        workers.add(new Worker("Olga", 30));
        workers.add(new Worker("Svetlana", 28));
        workers.add(new Worker("Sergey", 25));
        workers.add(new Worker("Maxim", 18));
        workers.stream().filter(x -> x.getAge() > 20).forEach(System.out::println);

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Сортировка по рейтингу фильма:");
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie("Schindler's List", 1993, 8.9));
        movies.add(new Movie("Shawshank Redemption", 1994, 9.2));
        movies.add(new Movie("The Godfather Part II", 1974, 9.0));
        movies.add(new Movie("The Godfather", 1972, 9.1));
        movies.add(new Movie("The Dark Knight", 2008, 9.0));
        movies.stream().sorted(Comparator.comparingDouble(Movie::getImdbRating)).forEach(System.out::println);
    }
}
