import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main1920 {

    public static void main(String[] args) {
        ArrayList<Integer> data = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            data.add(sc.nextInt());
        }
        Collections.sort(data);

        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            int findData = sc.nextInt();
            int start = 0;
            int end = n-1;
            boolean find = false;
            while (start <= end) {
                int midIndex = (start + end) / 2;
                int midValue = data.get(midIndex);

                if (midValue > findData) {
                    end = midIndex - 1;
                } else if (midValue < findData) {
                    start = midIndex + 1;
                } else {
                    find = true;
                    break;
                }
            }

            System.out.println(find ? 1 : 0);
        }

        sc.close();
    }
}
