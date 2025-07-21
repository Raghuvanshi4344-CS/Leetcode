import java.util.*;

class Solution {
    public int[] findOrder(int V, int[][] edges) {
        // Create adjacency list
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        // Fill the adjacency list
        for (int i = 0; i < edges.length; i++) {
            int v = edges[i][0];
            int u = edges[i][1];
            adj.get(u).add(v);
        }

        // Initialize in-degree array
        int[] indegree = new int[V];
        for (int i = 0; i < V; i++) {
            for (int j = 0; j < adj.get(i).size(); j++) {
                int node = adj.get(i).get(j);
                indegree[node]++;
            }
        }

        // Initialize queue with nodes having 0 in-degree
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) q.add(i);
        }

        // Perform topological sort
        int[] topo = new int[V];
        int idx = 0;

        while (!q.isEmpty()) {
            int node = q.poll();
            topo[idx++] = node;

            for (int neigh : adj.get(node)) {
                indegree[neigh]--;
                if (indegree[neigh] == 0) {
                    q.add(neigh);
                }
            }
        }
        if (idx != V) return new int[0];

        return topo;
    }
}
