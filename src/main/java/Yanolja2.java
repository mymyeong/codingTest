import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Yanolja2 {
    public int solution(int[] A) {
        int count = getSortArrayCount(Arrays.stream(A).boxed().collect(Collectors.toList()), 0);

        return count;
    }

    private int getSortArrayCount(List<Integer> a, int count) {
        int sum = 0;
        for (int i = 0; i < a.size(); i++) {
            if (sum + a.get(i) < 0) {
                count++;
                int swapIndex = getSwapIndex(a, i);
                swapList(a, swapIndex);
                return getSortArrayCount(a, count);
            } else {
                sum += a.get(i);
            }
        }

        return count;
    }

    private static int getSwapIndex(List<Integer> a, int i) {
        int swapIndex = i;
        if (i >= 1) {
            for (int j = i; j >= 0; j--) {
                if (a.get(j) < a.get(i)) {
                    swapIndex = j;
                }
            }
        }
        return swapIndex;
    }

    private static void swapList(List<Integer> a, int i) {
        Integer temp = a.remove(i);
        a.add(temp);
    }
}
