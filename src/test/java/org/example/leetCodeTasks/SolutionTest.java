package org.example.leetCodeTasks;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void numJewelsInStonesTest() {
        String jewels1 = "aA";
        String stones1 = "aAAbbbb";
        int output1 = Solution.numJewelsInStones(jewels1, stones1);
        assertEquals(3, output1);

        String jewels2 = "z";
        String stones2 = "ZZ";
        int output2 = Solution.numJewelsInStones(jewels2, stones2);
        assertEquals(0, output2);

        String jewels3 = "abc";
        String stones3 = "AbCdeF";
        int output3 = Solution.numJewelsInStones(jewels3, stones3);
        assertEquals(1, output3);
    }

    @Test
    public void numIdenticalPairsTest() {
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        assertEquals(4, Solution.numIdenticalPairs(nums1));

        int[] nums2 = {1, 1, 1, 1};
        assertEquals(6, Solution.numIdenticalPairs(nums2));

        int[] nums3 = {1, 2, 3};
        assertEquals(0, Solution.numIdenticalPairs(nums3));
    }

    @Test
    public void maxNumberOfBalloonsTest() {
        assertEquals(1, Solution.maxNumberOfBalloons("nlaebolko"));
        assertEquals(2, Solution.maxNumberOfBalloons("loonbalxballpoon"));
        assertEquals(0, Solution.maxNumberOfBalloons("leetcode"));
        assertEquals(0, Solution.maxNumberOfBalloons(""));
        assertEquals(1, Solution.maxNumberOfBalloons("balloon"));
        assertEquals(0, Solution.maxNumberOfBalloons("balon"));
    }
}