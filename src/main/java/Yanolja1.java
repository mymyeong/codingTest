import java.util.*;

public class Yanolja1 {

    public int solution(String[] A) {
        ArrayList<String> list = getStringList(A, 0);

        int maxLen = 0;

        for (String s : list) {
            maxLen = Math.max(maxLen, s.length());
        }
        return maxLen;
    }

    private ArrayList<String> getStringList(String[] a, int index) {
        ArrayList<String> list = new ArrayList<>();
        list.add("");

        if (index == a.length) {
            return list;
        }

        ArrayList<String> temp = getStringList(a, index + 1);

        ArrayList<String> result = new ArrayList<>(temp);

        for (String s : temp) {
            String str = s + a[index];

            if (checkString(str)) {
                result.add(str);
            }
        }

        return result;
    }

    private boolean checkString(String str) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            if (set.contains(str.charAt(i))) {
                return false;
            }
            set.add(str.charAt(i));
        }

        return true;
    }
}
