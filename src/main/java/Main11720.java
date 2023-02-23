import java.util.Arrays;
import java.util.Scanner;

public class Main11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String input = sc.next();

        sc.close();

        System.out.println(Arrays.stream(input.split("")).mapToInt(Integer::parseInt).sum());
    }

}
