package P2024_01;

import java.util.*;

public class Sokka {
    public static void main(String[] args) {
        int n = 6;
        int k = 17;
        int[][] roads = {{5,4,6},{5,2,5},{0,4,2},{2,3,3},{1,2,7},{0,1,3}};

        Map<Integer, List<NodeValue>> graph = new HashMap<>();
        Arrays.stream(roads).forEach(road -> {
            graph.computeIfAbsent(road[0], key -> new ArrayList<>()).add(new NodeValue(road[1], road[2]));
            graph.computeIfAbsent(road[1], key -> new ArrayList<>()).add(new NodeValue(road[0], road[2]));
        });

        BfsSoka bfs = new BfsSoka();
        System.out.println(bfs.bfs(graph, 0, k));
    }

}
class BfsSoka {
    public List<Integer> bfs(Map<Integer, List<NodeValue>> graph, int start, int k) {
        List<Integer> nodes = new ArrayList<>();
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{start, 0});

        while(!queue.isEmpty()) {
            int[] current = queue.poll();
            int currentNode = current[0];
            int currentTime = current[1];

            if(currentTime == k) {
                nodes.add(currentNode);
            } else if(currentTime < k) {
                for(NodeValue nextNode : graph.getOrDefault(currentNode, Collections.emptyList())) {
                    int time = currentTime + nextNode.time;
                    if(time <= k) {
                        queue.offer(new int[]{nextNode.node, time});
                    }
                }
            }
        }
        return new ArrayList<>(new HashSet<>(nodes));
    }
}
class NodeValue {
    int node;
    int time;

    NodeValue(int node, int time) {
        this.node = node;
        this.time = time;
    }
}