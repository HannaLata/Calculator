package org.example.leetCodeTasks;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Solution {
    public static int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelsChars = new HashSet<>(jewels.chars().mapToObj(c -> (char) c).toList());

        int count = 0;
        for ( char stone : stones.toCharArray() ) {
            if ( jewelsChars.contains(stone) ) {
                count++;
            }
        }

        return count;
    }

    public static int numIdenticalPairs(int[] nums) {
        return Arrays.stream(nums)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values()
                .stream()
                .mapToInt(count -> (int) ((count * (count - 1)) / 2))
                .sum();
    }

    public static int maxNumberOfBalloons(String text) {
        Map<Character, Long> counts = text.chars()
                .mapToObj(c -> (char) c)
                .collect(HashMap::new, (map, c) -> map.merge(c, 1L, Long::sum), HashMap::putAll);

        String balloon = "balloon";
        return balloon.chars()
                .mapToObj(c -> (char) c)
                .filter(c -> c == 'l' || c == 'o')
                .mapToInt(c -> (int) (counts.getOrDefault(c, 0L) / 2))
                .min()
                .orElse(0);
    }
}
