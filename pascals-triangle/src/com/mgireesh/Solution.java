package com.mgireesh;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> answer = new LinkedList<List<Integer>>();
		List<Integer> prevList = null;

		for (int i = 0; i < numRows; i++) {
			List<Integer> list = new LinkedList<Integer>();
			if (prevList == null) {
				list.add(1);
			} else {
				list.add(prevList.get(0));
				for (int j = 0; j < prevList.size() - 1; j++) {
					int sum = prevList.get(j) + prevList.get(j + 1);
					list.add(sum);
				}
				list.add(prevList.get(prevList.size() - 1));
			}
			answer.add(list);
			prevList = list;
		}
		return answer;
	}
}