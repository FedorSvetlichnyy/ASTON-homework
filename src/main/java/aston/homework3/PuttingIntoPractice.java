package aston.homework3;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PuttingIntoPractice {

    public static void main(String... args) {
        Trader raoul = new Trader("Raoul", "Cambridge");
        Trader mario = new Trader("Mario", "Milan");
        Trader alan = new Trader("Alan", "Cambridge");
        Trader brian = new Trader("Brian", "Cambridge");

        List<Transaction> transactions = Arrays.asList(
                new Transaction(brian, 2011, 300),
                new Transaction(raoul, 2012, 1000),
                new Transaction(raoul, 2011, 400),
                new Transaction(mario, 2012, 710),
                new Transaction(mario, 2012, 700),
                new Transaction(alan, 2012, 950)
        );

        // task 1 (Найти все транзакции за 2011 год и отсортировать их по сумме (от меньшей к большей).
        System.out.println("task 1");
        List<Transaction> list1 = transactions.stream()
                .filter(p -> p.getYear() == 2011)
                .sorted()  //имплементировали Comparable в классе Transaction и переопределили метод compareTo
                .collect(Collectors.toList());
        System.out.println(list1);
        // или foreach можно, ниже
        transactions.stream()
                .filter(p -> p.getYear() == 2011)
                .sorted().
                forEach(System.out::println);

        // task 2 (Вывести список неповторяющихся городов, в которых работают трейдеры.).
        System.out.println("task 2");
        // можно сначала создать список трейдеров или без создания списка ниже
        List<Trader> traders = new ArrayList<>();
        traders.add(raoul);
        traders.add(mario);
        traders.add(alan);
        traders.add(brian);
        traders.stream()
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        //без создания списка тредеров
        Stream.of(raoul, mario, alan, brian)
                .map(Trader::getCity)
                .distinct()
                .forEach(System.out::println);

        // task 3 (Найти всех трейдеров из Кембриджа и отсортировать их по именам).
        System.out.println("task 3");
        traders.stream()
                .filter(p -> p.getCity().equals("Cambridge")) //фильруем город
                .sorted()
                .collect(Collectors.groupingBy(Trader::getCity))
                .entrySet().forEach(System.out::println);

        // task 4 (Вернуть строку со всеми именами трейдеров, отсортированными в алфавитном порядке.)
        System.out.println("task 4");
        // просто вывод имен
        traders.stream()
                .map(Trader::getName)
                .sorted()
                .forEach(System.out::println);

        // возврат именно строки с разделителем
        String string = traders.stream()
                .map(Trader::getName)
                .sorted()
                .collect(Collectors.joining(", "));
        System.out.println(string);

        // task 5 (Выяснить, существует ли хоть один трейдер из Милана.)
        System.out.println("task 5");
        traders.stream()
                .filter(p -> p.getCity().equals("Milan")) //фильруем город
                .forEach(System.out::println);

        //Ниже выводит true или false
        System.out.println(traders.stream()
                .anyMatch(s -> s.getCity().equals("Milan")));

        // task 6 (Вывести СУММУ всех транзакций трейдеров из Кембриджа.)
        System.out.println("task 6");
        //СУММАAA
        Integer sum = transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge")) //фильруем город
                .map(Transaction::getValue)//получаем значения транзакций
                .reduce(0, Integer::sum);
        System.out.println(sum);

        // task 6 (Вывести СУММЫ всех транзакций трейдеров из Кембриджа.)
        //СУММЫЫЫ
        transactions.stream()
                .filter(p -> p.getTrader().getCity().equals("Cambridge")) //фильруем город
                .map(Transaction::getValue)//получаем значения транзакций
                .forEach(System.out::println);

        // task 7 (Какова максимальная сумма среди всех транзакций?)
        System.out.println("task 7");
        Integer max = transactions.stream()
                .map(Transaction::getValue)//получаем значения транзакций
                .max(Comparator.naturalOrder()).get();
        System.out.println(max);

        // task 8 (Найти транзакцию с минимальной суммой.)
        System.out.println("task 8");
        Integer min = transactions.stream()
                .map(Transaction::getValue)//получаем значения транзакций
                .min(Comparator.naturalOrder()).get();
        System.out.println(min);






    }
}