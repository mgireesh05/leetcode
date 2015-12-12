package com.mgireesh;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
		ArrayList<Integer> arrList = new ArrayList<Integer>();
		for (int i = 0; i < nums.length; i++) {
			arrList.add(nums[i]);
		}
		return ((List<List<Integer>>) permute(arrList));
	}

	public ArrayList<List<Integer>> permute(ArrayList<Integer> arrList) {
		ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
		if (arrList.size() == 1) {
			ArrayList<Integer> temp = new ArrayList<Integer>();
			Integer last = arrList.get(0);
			temp.add(last);
			answer.add(temp);
			return answer;
		}

		ArrayList<Integer> subArr = new ArrayList<Integer>();
		for (int i = 0; i < arrList.size() - 1; i++) {
			subArr.add(arrList.get(i));
		}

		Integer lastInt = arrList.get(arrList.size() - 1);
		answer = permute(subArr);
		answer = insert(answer, lastInt);
		return answer;
	}

	public ArrayList<List<Integer>> insert(ArrayList<List<Integer>> arr, Integer num) {
		ArrayList<List<Integer>> answer = new ArrayList<List<Integer>>();
		for (int i = 0; i < arr.size(); i++) {
			ArrayList<Integer> temp = (ArrayList<Integer>) arr.get(i);
			insertIntoList(answer, temp, num);
		}
		return answer;
	}

	public void insertIntoList(ArrayList<List<Integer>> answer, ArrayList<Integer> list, Integer num) {
		ArrayList<Integer> temp = new ArrayList<Integer>();
		for (int i = 0; i < list.size() + 1; i++) {
			temp = (ArrayList<Integer>) list.clone();
			temp.add(i, num);
			answer.add(temp);
		}
	}
}
