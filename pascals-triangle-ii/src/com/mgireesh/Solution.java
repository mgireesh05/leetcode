package com.mgireesh;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Integer> getRow(int rowIndex) {
		List<Integer> list = new LinkedList<Integer>();

		int size = 0;
		for (int i = 0; i <= rowIndex; i++) {
			size = list.size();
			if (size == 0) {
				list.add(1);
			} else if (size == 1) {
				list.add(1);
			} else {
				int prev = list.get(0);
				int curr = 0;
				for (int j = 1; j < size; j++) {
					curr = list.get(j);
					list.set(j, prev + curr);
					prev = curr;
				}
				list.add(1);
			}
		}
		return list;
	}
}
