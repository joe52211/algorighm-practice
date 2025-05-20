import java.util.*;

public class Main {
    static ArrayList<Integer>[] graph;
    static boolean[] visited;
    static int count = 0;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int com = sc.nextInt(); // 컴퓨터 수
        int pair = sc.nextInt(); // 연결 쌍 수

        graph = new ArrayList[com + 1];
        visited = new boolean[com + 1];

        for (int i = 1; i <= com; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < pair; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            graph[a].add(b);
            graph[b].add(a);
        }

        dfs(1);
        System.out.println(count - 1); // 1번 컴퓨터 제외하고 출력
    }

    public static void dfs(int node) {
        visited[node] = true;
        count++;

        for (int next : graph[node]) {
            if (!visited[next]) {
                dfs(next);
            }
        }
    }
}
