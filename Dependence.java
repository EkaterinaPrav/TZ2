import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Dependence {

    public static void main(String[] args) {
        int startSize = 50000;
        int endSize = 1000000;
        int stepSize = 50000;
        int iterations = 100;

        for (int size = startSize; size <= endSize; size += stepSize) {
            long totalExecutionTime = 0;

            for (int i = 0; i < iterations; i++) {
                List<Integer> numbers = generateRandomNumbers(size);

                long startTime = System.nanoTime();
                _sum(numbers);
                long endTime = System.nanoTime();
                totalExecutionTime += (endTime - startTime);
            }

            double averageExecutionTime = totalExecutionTime / (double) iterations / 1e6;
            System.out.println(size + ": " + averageExecutionTime);
        }
    }

    public static List<Integer> generateRandomNumbers(int size) {
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(ThreadLocalRandom.current().nextInt(1, 100));
        }
        return numbers;
    }

    public static int _sum(List<Integer> numbers) {
        try {
            return numbers.stream().mapToInt(Integer::intValue).sum();
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Сумма выходит за границы допустимых значений: " + e.getMessage());
        }
    }
}


