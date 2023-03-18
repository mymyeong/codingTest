import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Yanolja1Test {
    private Yanolja1 yanolja1 = new Yanolja1();

    @Test
    void solution() {
        int result = yanolja1.solution(new String[]{"co", "dil", "ity"});
        System.out.println(result);
    }
}