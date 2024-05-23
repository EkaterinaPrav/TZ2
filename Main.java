import java.util.Collections;
import java.util.List;

public class Main {

    public static int _min(List<Integer> numbers) {
        return Collections.min(numbers);
    }

    public static int _max(List<Integer> numbers) {
        return Collections.max(numbers);
    }

    public static int _sum(List<Integer> numbers) {
        try {
            return numbers.stream().mapToInt(Integer::intValue).sum();
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Сумма выходит за границы допустимых значений: " + e.getMessage());
        }
    }

    public static long _mult(List<Integer> numbers) {
        try {
            return numbers.stream().mapToLong(Integer::longValue).reduce(1, Math::multiplyExact);
        } catch (ArithmeticException e) {
            throw new ArithmeticException("Произведение выходит за границы допустимых значений: " + e.getMessage());
        }
    }
}
