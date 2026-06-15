class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> graph = new HashMap<>();
        for(int i=0; i<numCourses; i++){
            graph.put(i, new ArrayList<>());
        }
        for(int[] prereq: prerequisites){
           graph.get(prereq[1]).add(prereq[0]);
        }
        
        int[] visited= new int[numCourses];
        for(int i=0; i<numCourses; i++){
            if(hasCycle(i, graph, visited)){
                return false;
            }
        }
        return true;
    }
    private boolean hasCycle(int course, Map<Integer, List<Integer>> graph, int[] visited){
        if(visited[course]==1){
            return true;
        }
        if(visited[course]==2){
            return false;
        }
        visited[course]=1;
        for(int neighbour: graph.get(course)){
            if(hasCycle(neighbour, graph, visited)){
                return true;
            }
        }
        visited[course]=2;
        return false;
    }
}
