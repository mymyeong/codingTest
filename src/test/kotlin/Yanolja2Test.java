import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Yanolja2Test {

    private Yanolja2 yanolja2 = new Yanolja2();

    @Test
    void solution1() {
        assertEquals(yanolja2.solution(new int[]{10, -10, -1, -1, 10}), 1);
    }

    @Test
    void solution2() {
        assertEquals(yanolja2.solution(new int[]{-1, -1, -1, 1, 1, 1, 1}), 3);
    }

    @Test
    void solution3() {
        assertEquals(yanolja2.solution(new int[]{5, -2, -3, 1}), 0);
    }
}