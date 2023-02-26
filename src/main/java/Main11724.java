import java.util.ArrayList;
import java.util.Scanner;

public class Main11724 {
    static boolean visited[];
    static ArrayList<Integer>[] node;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        visited = new boolean[n];
        node = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            node[i] = new ArrayList();
            visited[i] = false;
        }

        for (int i = 0; i < m; i++) {
            int s = sc.nextInt();
            int e = sc.nextInt();

            node[s-1].add(e-1);
            node[e-1].add(s-1);
        }

        sc.close();

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                count++;

                dfs(i);
            }
        }

        System.out.println(count);
    }

    private static void dfs(int v) {
        if (visited[v]) {
            return;
        }

        visited[v] = true;
        for (int i : node[v]) {
            if (visited[i] == false) {
                dfs(i);
            }
        }
    }
}
