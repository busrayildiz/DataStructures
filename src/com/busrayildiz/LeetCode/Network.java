package com.busrayildiz.LeetCode;

import java.util.*;

public class Network {
    public static int networkDelayTime(int[][] times, int n, int k) {
        Map<Integer, List<int[]>> adjMap = new HashMap<>();
        for (int[] time : times) {
            int s = time[0];
            int t = time[1];
            int w = time[2];
            adjMap.putIfAbsent(s, new ArrayList<>());
            adjMap.get(s).add(new int[]{t, w});
        }
        if (!adjMap.containsKey(k)) {
            return -1;
        }
        int total = 0;
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{k, 0});
        boolean[] visited = new boolean[n + 1];
        while (!pq.isEmpty()) {
            final int[] pair = pq.poll();
            int s = pair[0];
            int w = pair[1];
            if (visited[s]) continue;
            visited[s] = true;
            n--;
            total = w;
            if (adjMap.containsKey(s)) {
                for (int[] t : adjMap.get(s)) {
                    pq.add(new int[]{t[0], w + t[1]});
                }
            }
        }
        return n == 0 ? total : -1;
    }

    public static void main(String[] args) {
        System.out.println("networkDelayTime(new int[][] {{2, 1, 1},\n                {2, 3, 1}, {3, 4, 1}}, 4, 2) = " + networkDelayTime(new int[][]{{2, 1, 1},
                {2, 3, 1}, {3, 4, 1}}, 4, 2));
    }
}
