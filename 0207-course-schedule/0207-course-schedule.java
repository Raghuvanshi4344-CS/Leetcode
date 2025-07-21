class Solution {
    public boolean canFinish(int numCourses, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            adj.get(u).add(v);
        }
        int []indegree=new int[numCourses];
        for(int i=0;i<numCourses;i++){
            for(int j=0;j<adj.get(i).size();j++){
                int node=adj.get(i).get(j);
                indegree[node]++;
            }
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        ArrayList<Integer> topo = new ArrayList<>();
        while (!q.isEmpty()) {
            int node = q.poll();
            topo.add(node);
            ArrayList<Integer> neigh=adj.get(node);
            for(int i=0;i<neigh.size();i++){
                int neig = neigh.get(i);
                indegree[neig]--;
                if (indegree[neig] == 0) {
                    q.add(neig);
                }
            }
        }
        if(topo.size()==numCourses) return true;
        return false;
    }
}