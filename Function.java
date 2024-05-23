import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Function {

    public static List<Integer> readNumbersFromFile() {
        String filename = "/Users/ekaterina/Desktop/test.txt";
        try {
            List<String> lines = Files.readAllLines(Paths.get(filename));
            return lines.stream()
                    .flatMap(line -> Arrays.stream(line.split("\\s+")))
                    .filter(s -> !s.isEmpty())
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (IOException e) {
            throw new RuntimeException("Ошибка при чтении файла: " + filename, e);
        }
    }
}