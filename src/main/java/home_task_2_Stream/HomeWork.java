package home_task_2_Stream;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class HomeWork {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 2, 4, 5, 1, 6, 7, 5);
        System.out.println(numbers);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Удвоить все числа списка:");
        List<Integer> doubleNumbers = numbers.stream().map(x -> x * 2).toList();
        doubleNumbers.forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Все слова в списке сделать заглавными буквами:");
        List<String> stringList = List.of("tom", "sam", "mark", "cant", "bill");
        stringList.stream().map(String::toUpperCase).toList().forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Вывести имена вех работников:");
        List<Worker> workers1 = new ArrayList<>();
        workers1.add(new Worker("Ivan", 22));
        workers1.add(new Worker("Petr", 19));
        workers1.add(new Worker("Olga", 30));
        workers1.add(new Worker("Svetlana", 28));
        workers1.add(new Worker("Sergey", 25));
        workers1.add(new Worker("Maxim", 18));
        workers1.stream().map(Worker::getName).toList().forEach(System.out::println);

        System.out.println("-----------------------------------------------------------------");
        System.out.println("Сумма всех уникальных чисел в списке:");
        System.out.println(numbers.stream().distinct().mapToInt(Integer::intValue).sum());

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Сумма всех четных чисел в листе:");
        int sum = numbers.stream().filter(x -> x % 2 == 0).mapToInt(Integer::intValue).sum();
        System.out.println(sum);

        System.out.println("-------------------------------------------------------------------------");
        Map<Integer, Long> count = numbers.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        count.forEach((k, v) -> System.out.println(k + ": " + v));

        //Map<Integer, Integer> count1 = numbers.stream().collect(Collectors.toMap(c -> c, c -> 1, Integer::sum));
        //count1.forEach((k, v) -> System.out.println(k + ": " + v));

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Вывод листа через лямда стримы:");
        numbers.forEach(System.out::println);
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
