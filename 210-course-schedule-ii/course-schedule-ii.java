class Solution {
    static class Edge{
        int src ; 
        int dest;

        public Edge(int src , int dest){
            this.src = src ; 
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<Edge> graph[] , int[][] courses){

        for(int i = 0 ; i<graph.length ; i++){
            graph[i] = new ArrayList<>();
        }

        for(int course[]  : courses){
            graph[course[1]].add(new Edge(course[1] , course[0]));
        }


    }

     public static void calcIndegree(ArrayList<Edge> graph[], int indegree[]) {
        for (int i = 0; i < graph.length; i++) {
            int v = i; // optional 

            for (int j = 0; j < graph[v].size(); j++) {
                Edge e = graph[v].get(j);
                indegree[e.dest]++;
            }
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        
        ArrayList<Edge> graph[] = new ArrayList[numCourses];

        int indegree[] = new int[graph.length];
        createGraph(graph , prerequisites);

        calcIndegree(graph , indegree);
        int courseorder[] = new int[numCourses];
        Queue<Integer> q = new LinkedList<>();

        // adding nodes into queues whose indegree is 0 
        for (int i = 0; i < indegree.length; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int k =  0 ;
        // bfs
        while (!q.isEmpty()) {
            int curr = q.remove();
            courseorder[k++] = curr ;// topological sort sequence 

            for (int i = 0; i < graph[curr].size(); i++) {
                int neighbour = graph[curr].get(i).dest;
                indegree[neighbour]--;
                if (indegree[neighbour] == 0) {
                    q.add(neighbour);
                }
            }

            

        }


        if (k == numCourses) {
            return courseorder;
        } else {
            return new int[0];
        }

        
    }
}