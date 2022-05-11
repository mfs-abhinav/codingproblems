package com.abhi.array;

public class findMaxConsecutiveOnes {
    public static void main(String[] args) {
        System.out.println(findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1}));
    }
    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxCurrentConsecutiveOnes = 0;
        int maxConsecutiveOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                maxCurrentConsecutiveOnes++;
            } else {
                maxConsecutiveOnes = Math.max(maxCurrentConsecutiveOnes, maxConsecutiveOnes);
                maxCurrentConsecutiveOnes = 0;
            }
        }
        return Math.max(maxConsecutiveOnes,maxCurrentConsecutiveOnes);
    }
}
