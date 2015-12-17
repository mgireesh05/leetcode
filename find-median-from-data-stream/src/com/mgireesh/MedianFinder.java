package com.mgireesh;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	int count = 0;

	// Adds a number into the data structure.
	public void addNum(int num) {
		if (count % 2 == 0) {
			minHeap.offer(num);
		} else {
			maxHeap.offer(num);
		}
		count++;
		// System.out.println(minHeap);
		// System.out.println(maxHeap);
	}

	// Returns the median of current data stream
	public double findMedian() {
		double median = 0;
		if (minHeap.size() == maxHeap.size()) {
			median = (double) (minHeap.peek() + maxHeap.peek()) / 2;
		} else {
			if (minHeap.size() > maxHeap.size()) {
				// median =
			} else {
				// median =
			}
		}
		return median;
	}
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();