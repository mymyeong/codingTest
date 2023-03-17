import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class YanoljaTest {
    private final Yanolja0 yanolja0 = new Yanolja0();

    @ParameterizedTest
    @CsvSource({
            "1041, 5",
            "529, 4",
            "20, 1",
            "15, 0",
            "32, 0",
            "9, 2"
    })
    void solution1(int input, int result) {
        assertEquals(result, yanolja0.solution(input));
    }
}