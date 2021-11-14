package com.busrayildiz.Challenges;

import java.util.*;

public class SortTheSummary {

    public static List<List<Integer>> sort (List<Integer> arr){
        List<List<Integer>> result = new ArrayList<>();

        Map<Integer, Integer> map = new HashMap<> ();

        for (Integer value : arr) {
            final int freq = map.getOrDefault(value, 0) + 1;
            map.put(value, freq);
        }

        boolean[] freqExists = new boolean[arr.size()];
        boolean changeOrder = false;
        for (Map.Entry<Integer,Integer> entry : map.entrySet()) {
            List<Integer> list = new ArrayList<>();
            list.add(entry.getKey());
            list.add(entry.getValue());
            if (freqExists[entry.getValue()]) {
                changeOrder = true;
            }
            freqExists[entry.getValue()] = true;
            result.add(list);
        }

        boolean finalChangeOrder = changeOrder;
        result.sort((a, b) -> finalChangeOrder ? a.get(0) - b.get(0) : b.get(1) - a.get(1));

        return result;
    }

    public static void main(String[] args) {
        System.out.println(sort(Arrays.asList(3, 3, 2 ,2 ,2 , 1)));
    }
}
