import java.util.Arrays;
import java.util.stream.Collectors;

public class Bamin2 {
    public String solution(String[] leftArray, String[] rightArray) {
        return Arrays.stream(leftArray)
                .filter(leftValue -> Arrays.asList(rightArray).contains(leftValue))
                .distinct()
                .sorted()
                .collect(Collectors.joining(","));
    }
}
