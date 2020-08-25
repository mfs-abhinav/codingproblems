package com.abhi.string;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacterInString {
    public static void main(String[] args) {
        PrintDuplicateCharacterInString.print("asdcdrasd");
    }

    public static void print(String str) {
        char[] chars = str.toCharArray();
        Map<Character, Integer> map = new HashMap<>();

        for (Character ch : chars) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + "  " + entry.getValue());
            }
        }

    }
}
