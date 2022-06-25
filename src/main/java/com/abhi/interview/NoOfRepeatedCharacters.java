package com.abhi.interview;

import java.util.HashMap;
import java.util.Map;

// str = "tcs"
// str =  "cts"

// str == "women"
// str == "men"

// str == "woman"
// str == "men"

//meet
//met

//

// how many tims char repetaed
public class NoOfRepeatedCharacters {
    public static void main(String[] args) {
        String s = "abhinav kumar";
        Map<Character, Integer> map = new HashMap<>();

        for (char ch: s.toCharArray()) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        System.out.println(map);

//        for (char ch: s.toCharArray()) {
//            System.out.println(ch + " => " + map.get(ch));
//        }

    }
}
