class Solution {
    public int countComponents(int n, int[][] edges) {
    Map<Integer, List<Integer>> graph = new HashMap<>();
    for(int i=0; i<n; i++){
        graph.put(i, new ArrayList<>());
    }
    for(int[] edge: edges){
        int u=edge[0];
        int v=edge[1];
        graph.get(u).add(v);
        graph.get(v).add(u);
    }
    int count=0;
    Set<Integer>visited= new HashSet<>();
    for(int node=0; node<n; node++){
        if(!visited.contains(node)){
            count++;
            dfs(graph,node,visited);
        }
    }
    return count;
   }
    private void dfs(Map<Integer, List<Integer>> graph, int current, Set<Integer> visited){
          visited.add(current);
          for(int neighbour: graph.get(current)){
            if(!visited.contains(neighbour)){
                dfs(graph,neighbour,visited);
            }
          }
    }
}
