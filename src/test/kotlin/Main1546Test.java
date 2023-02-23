import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Main1546Test {
    @Test
    void getNewAvgTest1() {
        int[] ints = {40, 80, 60};
        assertEquals(Main1546.getNewAvg(ints), 75.0);
    }

    @Test
    void getNewAvgTest2() {
        int[] ints = {10, 20, 30};
        assertEquals(Main1546.getNewAvg(ints), 66.666667, 0.000001);
    }

    @Test
    void getNewAvgTest3() {
        int[] ints = {1, 100, 100, 100};
        assertEquals(Main1546.getNewAvg(ints), 75.25, 0.01);
    }

    @Test
    void getNewAvgTest4() {
        int[] ints = {1, 2, 4, 8, 16};
        assertEquals(Main1546.getNewAvg(ints), 38.75, 0.01);
    }

    @Test
    void getNewAvgTest5() {
        int[] ints = {3, 10};
        assertEquals(Main1546.getNewAvg(ints), 65.0, 0.1);
    }

    @Test
    void getNewAvgTest6() {
        int[] ints = {10, 20, 0, 100};
        assertEquals(Main1546.getNewAvg(ints), 32.5, 0.1);
    }

    @Test
    void getNewAvgTest7() {
        int[] ints = {50};
        assertEquals(Main1546.getNewAvg(ints), 100.0, 0.1);
    }

    @Test
    void getNewAvgTest8() {
        int[] ints = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        assertEquals(Main1546.getNewAvg(ints), 55.55555555555556, 0.00000000000001);
    }
}