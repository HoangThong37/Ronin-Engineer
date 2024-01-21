package com.backend.roin_engineer.grouping_string;

import java.util.*;

public class groupingString {

//    Example 1:
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]

    public static void main(String[] args) {
        String[] strings = {"eat","tea","tan","ate","nat","bat"};
        //String[] strings1 = {""};
        //String[] strings2 = {"a"};
        List<List<String>> lists = grouping(strings);
        System.out.println(lists);
    }

    private static List<List<String>> grouping(String[] strings) {

        Map<String, List<String>> map = new HashMap<>();

        for (String s : strings) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            if (!map.containsKey(key)) map.put(key, new ArrayList<>());
            map.get(key).add(s);
        }

        return new ArrayList<>(map.values());
    }
}
