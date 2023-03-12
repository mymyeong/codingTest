import org.junit.jupiter.api.Test;

import java.util.Arrays;

class Bamin3Test {
    private Bamin3 bamin3 = new Bamin3();

    @Test
    void test3() {
        String[] productInfo = {"123456789,유기농쌀 4kg,50000", "234578882,배달이캐릭터숟가락,3000"};
        String[] dayilyProductSales = {"20220810,123456789,5", "20220810,234578882,30", "20220811,123456789,7"};
        String[] result = bamin3.solution(productInfo, dayilyProductSales);
        Arrays.stream(result).forEach(System.out::println);
    }
}