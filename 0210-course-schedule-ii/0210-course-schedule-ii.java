import java.util.*;

class Solution {

    public int[] findOrder(int numCourses, int[][] prerequisites) {

        List<Integer>[] graph = new ArrayList[numCourses];

        for(int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for(int[] pre : prerequisites) {
            graph[pre[1]].add(pre[0]);
        }

        int[] visited = new int[numCourses];
        Stack<Integer> stack = new Stack<>();

        for(int i = 0; i < numCourses; i++) {
            if(visited[i] == 0 && !dfs(graph, visited, stack, i)) {
                return new int[0];
            }
        }

        int[] result = new int[numCourses];
        int index = 0;

        while(!stack.isEmpty()) {
            result[index++] = stack.pop();
        }

        return result;
    }

    private boolean dfs(List<Integer>[] graph, int[] visited,
                        Stack<Integer> stack, int node) {

        visited[node] = 1;

        for(int next : graph[node]) {

            if(visited[next] == 1) {
                return false;
            }

            if(visited[next] == 0) {
                if(!dfs(graph, visited, stack, next)) {
                    return false;
                }
            }
        }

        visited[node] = 2;
        stack.push(node);

        return true;
    }
}