import java.util.*;

public class Main2178 {

    static int[][] map;
    static boolean[][] visited;
    static int N, M;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        N = sc.nextInt();
        M = sc.nextInt();

        map = new int[N][M];
        visited = new boolean[N][M];

        for (int i = 0; i < N; i++) {
            String readLine = sc.next();
            map[i] = Arrays.stream(readLine.split("")).mapToInt(Integer::parseInt).toArray();
        }

        sc.close();

        bfs(0, 0);

        System.out.println(map[N - 1][M - 1]);
    }

    static void bfs(int y, int x) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{x, y});
        visited[y][x] = true;

        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (Move move : Move.values()) {
                int dy = now[0] + move.getY();
                int dx = now[1] + move.getX();

                if (!isOverMap(dx, dy) && isMovable(dx, dy) && !visited[dy][dx]) {
                    visited[dy][dx] = true;
                    map[dy][dx] = map[now[0]][now[1]] + 1;
                    queue.add(new int[]{dy, dx});
                }
            }
        }
    }

    private static boolean isMovable(int dx, int dy) {
        return map[dy][dx] != 0;
    }

    static boolean isOverMap(int dx, int dy) {
        return dx < 0 || dy < 0 || dx >= M || dy >= N;
    }

    enum Move {
        UP(0, -1),
        DOWN(0, 1),
        LEFT(-1, 0),
        RIGHT(1, 0);

        private int x;
        private int y;

        Move(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public int getX() {
            return x;
        }

        public int getY() {
            return y;
        }
    }

    static void printMap(boolean[][] map) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(map[y][x] + "\t");
            }
            System.out.println();
        }
    }

    static void printMap(int[][] map) {
        for (int y = 0; y < map.length; y++) {
            for (int x = 0; x < map[y].length; x++) {
                System.out.print(map[y][x]);
            }
            System.out.println();
        }
    }

}
