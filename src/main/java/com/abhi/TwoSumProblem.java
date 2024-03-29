package com.abhi;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*Given an array of integers, return indices of the two numbers such that they add up to a specific target.
You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:
Given nums = [2, 7, 11, 15], target = 9,
Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].*/

public class TwoSumProblem {
	
	static int[] solveProblem(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i = 0; i < nums.length; i++) {
			int compliment = target - nums[i];
			
			if (map.containsKey(compliment)) {
				return new int[] { map.get(compliment), i};
			}
			map.put(nums[i], i);
		}
		
		throw new IllegalArgumentException("No two sum solution found");
	}

	public static void main(String[] args) {
		int[] result = solveProblem(new int[]{1, 2, 3}, 3);
		System.out.println(Arrays.toString(result));
	}

}
