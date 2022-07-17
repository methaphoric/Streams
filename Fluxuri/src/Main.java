import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {13, 8, -9, 15, -1, -78, 5, 69};
        numbers = Arrays.stream(numbers).filter(v -> (v > 0)).toArray();
        System.out.println(Arrays.toString(numbers));

        //Crearea unui flux gol
        Stream<String> empty = Stream.empty();

        //Crearea unui flux bazat pe un șir existent
        String[] cars = {"Honda", "Toyota", "Subaru"};
        Stream<String> carsStream = Arrays.stream(cars);

        // Crearea pe baza unor colecții
        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("horse");
        Stream<String> animalsStream = animals.stream();

        //Stream în baza unui HashMap
        HashMap<Integer, String> food = new HashMap<>();
        food.put(1, "pizza");
        food.put(2, "potatoes");
        food.put(3, "butter");
        Stream<String> foodNameStream = food.values().stream();
        Stream<Integer> foodKeysStream = food.keySet().stream();

        //Metoda builder
        Stream<String> sportsStream = Stream.<String>builder().add("Football").add("Hockey").add("Golf").build();

        //Metoda generate
        Stream<String> streamGenerated = Stream.generate(() -> "elem").limit(8);

        //Metoda Iterate
        Stream<Integer> streamIterate = Stream.iterate(0, n -> n + 1).limit(13);

        //Flux de valori simple
        int[] number = {1, -2, 20, 42, 3, -444};
        IntStream numberStream = Arrays.stream(number);

        //forEach - operatiune terminală
        String[] schools = {"Link Academy", "Dev Academy"};
        Stream<String> schoolsStream = Arrays.stream(schools);
        //schoolsStream.forEach(System.out::print);
        schoolsStream.forEach(s -> System.out.println("School name: " + s));

        //filter - operatiune neterminală
        //collect - operatiune terminală
        List<Integer> newNumber = Arrays.asList(1, 4, -5, -20);
        Stream<Integer> newNumberStream = newNumber.stream();
        ArrayList<Integer> numbers1 = newNumberStream.filter(value -> (value > 0)).collect(Collectors.toCollection(ArrayList::new));
        //ArrayList<Integer> numbers2 = newNumberStream.sorted(Comparator.reverseOrder()).collect(Collectors.toCollection(ArrayList::new));
        //ArrayList<Integer> numbers3 = newNumberStream.distinct().collect(Collectors.toCollection(ArrayList::new));
        //ArrayList<Integer> numbers4 = newNumberStream.filter(num -> num > 0).distinct().sorted().collect(Collectors.toCollection(ArrayList::new));

        List<Integer> nums = Arrays.asList(1, 2, 3);
        Stream<Integer> numsStream = nums.stream();
        Integer reduced = numsStream.reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(reduced);
    }
}
