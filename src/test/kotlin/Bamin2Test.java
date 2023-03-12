import org.junit.jupiter.api.Test;

class Bamin2Test {

    private Bamin2 bamin2 = new Bamin2();

    @Test
    void test2() {
        String result = bamin2.solution(new String[]{"a", "b", "c"}, new String[]{"e", "r", "q"});
        System.out.println(result);
    }
}