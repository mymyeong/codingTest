import java.util.ArrayList;
import java.util.Collections;

public class Yanolja0 {

    public int solution(int N) {
        String binary = Integer.toBinaryString(N);
        int count = 0;
        ArrayList<Integer> lengths = new ArrayList<>();

        for (int i = 0; i < binary.length(); i++) {
            if (binary.charAt(i) == '1' && (i + 1) < binary.length() && binary.charAt(i + 1) == '0') {
                count += 1;
                i++;
                while (binary.length() > (i + 1) && binary.charAt(i + 1) == '0') {
                    count += 1;
                    i++;
                    if ((i + 1) < binary.length() && binary.charAt(i + 1) == '1') {
                        break;
                    }
                }
                if (binary.length() > (i + 1) && binary.charAt(i + 1) == '1') {
                    lengths.add(count);
                    count = 0;
                }
            }
        }

        return lengths.isEmpty() ? 0 : Collections.max(lengths);
    }
}
