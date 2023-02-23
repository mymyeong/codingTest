import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.DoubleStream;

public class Main1546 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] input = new int[n];

        for (int i = 0; i < n; i++) {
            input[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(getNewAvg(input));
    }

    static double getNewAvg(int[] input) {
        int max = Arrays.stream(input).max().getAsInt();
        DoubleStream newScore = Arrays.stream(input).mapToDouble(it -> it / (double)max * 100.0);
        return newScore.average().getAsDouble();
    }
}
