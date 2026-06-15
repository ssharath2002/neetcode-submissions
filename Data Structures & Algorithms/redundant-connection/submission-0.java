class Solution {
    public int[] findRedundantConnection(int[][] edges) {
       Map<Integer, List<Integer>> graph= new HashMap<>();
       
       for(int[] edge: edges){
         int u=edge[0];
         int v=edge[1];
         Set<Integer>visited= new HashSet<>();
         if(graph.containsKey(u) && graph.containsKey(v) && dfs(graph,u,v,visited)){
            return edge;
         }
         graph.putIfAbsent(u, new ArrayList<>());
         graph.putIfAbsent(v, new ArrayList<>());
         graph.get(u).add(v);
         graph.get(v).add(u);
       } 
       return new int[0];
    }
    private boolean dfs(Map<Integer,List<Integer>> graph, int current, int target, Set<Integer>visited){
           if(current==target){
               return true;
           }
           visited.add(current);
           for(int neighbour: graph.getOrDefault(current, new ArrayList<>())){
                 if(!visited.contains(neighbour)){
                    if(dfs(graph, neighbour,target,visited)){
                        return true;
                    }
                 }
           }
           return false;
       }
}
