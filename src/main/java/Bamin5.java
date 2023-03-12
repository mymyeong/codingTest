import java.util.ArrayList;
import java.util.Comparator;
import java.util.Optional;
import java.util.Scanner;

public class Bamin5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        ArrayList<Integer> inputData = new ArrayList<>();
        for (int i = 1; i <= a; i++) {
            inputData.add(sc.nextInt());
        }

        Integer[] resultArray = inputData.stream().distinct().sorted(Comparator.reverseOrder()).toArray(Integer[]::new);

        if (resultArray.length > b) {
            Integer findValue = resultArray[b-1];
            System.out.println(findValue + " " + inputData.stream().filter(it -> it == findValue).count());
        } else {
            System.out.println("IMPOSSIBLE");
        }
    }
}
