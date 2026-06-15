class Solution {
    public boolean validTree(int n, int[][] edges) {
         if(edges.length!=n-1){
            return false;
         }
         HashMap<Integer, List<Integer>> graph= new HashMap<>();
         for(int i=0; i<n; i++){
            graph.put(i, new ArrayList<>());
         }
         for(int[] edge: edges){
            int u=edge[0];
            int v=edge[1];
            graph.get(u).add(v);
            graph.get(v).add(u);
         }
         Set<Integer>visited= new HashSet<>();
         if(hasCycle(graph,0,-1,visited)){
            return false;
         }
          return visited.size()==n; 
     }
    private boolean hasCycle(Map<Integer, List<Integer>> graph, int current, int parent, Set<Integer>visited){
        visited.add(current);
        for(int neighbour: graph.get(current)){
              if(!visited.contains(neighbour)){
                    if(hasCycle(graph,neighbour,current,visited)){
                        return true;
                    }
              }
              else if(neighbour!=parent){
                return true;
              }
        }
        return false;
    }
}
