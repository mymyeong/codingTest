import java.util.Arrays;

public class Bamin1 {
    public String solution(String[] params) {
        return Arrays.stream(params)
                .map(String::toUpperCase)
                .filter(it -> it.length() >= 5 && it.length() <= 10)
                .findFirst().orElse("없음");
    }
}
