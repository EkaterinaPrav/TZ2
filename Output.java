import java.util.List;
import java.util.stream.Collectors;

public class Output {

    public static void main(String[] args) {
        List<Integer> numbers = Function.readNumbersFromFile();

        System.out.println("В файле: " + numbers.stream().map(Object::toString).collect(Collectors.joining(" ")));

        int min = Main._min(numbers);
        System.out.println("Минимальное: " + min);

        int max = Main._max(numbers);
        System.out.println("Максимальное: " + max);

        List<Integer> sortedNumbers = numbers.stream().sorted().collect(Collectors.toList());

        int sum = Main._sum(sortedNumbers);
        String sumDetails = sortedNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("+"));
        System.out.println("Сумма: " + sum + " (" + sumDetails + ")");
        long mult = Main._mult(sortedNumbers);
        String multDetails = sortedNumbers.stream()
                .map(String::valueOf)
                .collect(Collectors.joining("*"));
        System.out.println("Произведение: " + mult + " (" + multDetails + ")");
    }
}

