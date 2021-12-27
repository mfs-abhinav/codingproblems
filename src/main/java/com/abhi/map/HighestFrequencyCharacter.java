package com.abhi.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequencyCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();
        Map<Character, Integer> map = new HashMap<>();
        for(char ch: str.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }
        char max = str.charAt(0);
        for(char ch: map.keySet()) {
            if (map.get(ch) > map.get(max)) {
                max = ch;
            }
        }
        System.out.println("Highest frequeny charactre is: " + max);
    }
}
