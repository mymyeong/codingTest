import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Bamin4Test {
    private Bamin4 bamin4 = new Bamin4();

    @Test
    void test4() {
        String result = bamin4.solution("/payment/1234/cancel");
        System.out.println(result);
    }

    @Test
    void test5() {
        String result = bamin4.solution("/product/1234");
        System.out.println(result);
    }

    @Test
    void test6() {
        String result = bamin4.solution("/payment/1234/approve ");
        System.out.println(result);
    }

}