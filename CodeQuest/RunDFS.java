package CodeQuest;

import java.util.*;

class Edge {
  int source, dest;

  public Edge(int src, int dest) {
    this.source = src;
    this.dest = dest;
  }
}


class GraphDFS {
  List<List<Integer>> adjacent_list = null;

  GraphDFS(List<Edge> edges, int N) {
    adjacent_list = new ArrayList<>();

    for (int i = 0; i < N; i++) {
      adjacent_list.add(new ArrayList<>());
    }

    for (Edge edge : edges) {
      adjacent_list.get(edge.source).add(edge.dest);
    }
  }
}


class RunDFS {
  public static int DFS(GraphDFS graph_dfs, int vertex, boolean[] discover, int[] arri_time,
      int[] dept_time, int time) {

    arri_time[vertex] = ++time;
    discover[vertex] = true;
    for (int i : graph_dfs.adjacent_list.get(vertex)) {
      if (!discover[i]) {
        time = DFS(graph_dfs, i, discover, arri_time, dept_time, time);
      }
    }
    dept_time[vertex] = ++time;
    return time;
  }

  public static void main(String[] args) {

    int i, j, N = 8, time = -1; // fixed nodes = 8

    List<Edge> edges = Arrays.asList(new Edge(0, 1), new Edge(0, 2), new Edge(2, 3), new Edge(2, 4),
        new Edge(3, 1), new Edge(3, 5), new Edge(4, 5), new Edge(6, 7));

    GraphDFS graph_dfs = new GraphDFS(edges, N);

    int[] arri_time = new int[N];
    int[] dept_time = new int[N];
    boolean[] discover = new boolean[N];

    for (i = 0; i < N; i++) {
      if (!discover[i]) {
        time = DFS(graph_dfs, i, discover, arri_time, dept_time, time);
      }
    }

    for (j = 0; j < N; j++) {
      System.out.println("Vertex " + j + ": (" + arri_time[j] + ", " + dept_time[j] + ")");
    }
  }
}
