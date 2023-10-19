lass Solution {
    public int minimumTime(int n, int[][] relations, int[] time) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[n];
        int[] maxTime = new int[n];
        
        for (int[] vec : relations) {
            int u = vec[0] - 1;//our wish we usually atart with '0' so -1
            int v = vec[1] - 1;
            adj.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            //computeif abset for mainting ararylist using map EG:(1,{2}),(1,{2,3});
            indegree[v]++;//increment indegeree after inserting in ararylist
        }
        
        Queue<Integer> queue = new LinkedList<>();//linked list due tio queue is absrttract class
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) { 
                queue.offer(i);//fo pushing
                maxTime[i] = time[i];
            }
        }
        
        while (!queue.isEmpty()) {
            int u = queue.poll(); //getting head from queue to reduce indegree
            List<Integer> neighbors = adj.getOrDefault(u, new ArrayList<>()); //get u's list if not presents creates and returns new empty arraylist
            //copying adjacency list to list to reduce indegeree
            for (int v : neighbors) {
                maxTime[v] = Math.max(maxTime[v], maxTime[u] + time[v]);
                indegree[v]--;
                if (indegree[v] == 0) {
                    queue.offer(v);//inserting
                }
            }
        }
        
        int result = 0; //to foind max value in arary
        for (int i = 0; i < n; i++) {
            result = Math.max(result, maxTime[i]);
        }
        
        return result;
    }
}