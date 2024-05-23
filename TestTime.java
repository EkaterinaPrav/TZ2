import org.junit.Test;

import java.util.List;
import java.util.ArrayList;

public class TestTime {
    private List<Integer> generatTest(int size) {
        List<Integer> numbers = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            numbers.add(i);
        }
        return numbers;
    }

    @Test(timeout = 10000)
    public void loadMin() {
        List<Integer> numbers = generatTest(100000);
        for (int i = 0; i < 100; ++i) {
            Main._min(numbers);
        }
    }

    @Test(timeout = 10000)
    public void loadMax() {
        List<Integer> numbers = generatTest(100000);
        for (int i = 0; i < 100; ++i) {
            Main._max(numbers);
        }
    }

    @Test(timeout = 10000)
    public void loadSum() {
        List<Integer> numbers = generatTest(100000);
        for (int i = 0; i < 100; ++i) {
            Main._sum(numbers);
        }
    }

    @Test(timeout = 10000)
    public void loadMult() {
        List<Integer> numbers = generatTest(100000);
        for (int i = 0; i < 10; ++i) {
            Main._mult(numbers);
        }
    }
}

