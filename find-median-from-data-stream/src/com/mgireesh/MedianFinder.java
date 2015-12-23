package com.mgireesh;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
	PriorityQueue<Integer> minHeap = new PriorityQueue<Integer>();
	PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
	double median = 0;

	// From :
	// https://disqus.com/home/discussion/geeksforgeeks/median_in_a_stream_of_integers_running_integers/#comment-1973339908

	// Adds a number into the data structure.
	public void addNum(int num) {

		if (minHeap.size() == 0 && maxHeap.size() == 0) {
			maxHeap.offer(num);
			median = num;
		} else {
			if (num <= median) {
				if (maxHeap.size() <= minHeap.size()) {
					maxHeap.offer(num);
				} else {
					minHeap.offer(maxHeap.remove());
					maxHeap.offer(num);
				}
			} else {
				if (maxHeap.size() >= minHeap.size()) {
					minHeap.offer(num);
				} else {
					maxHeap.offer(minHeap.remove());
				}
			}
			if (minHeap.size() == maxHeap.size()) {
				median = ((double) minHeap.peek() + maxHeap.peek()) / 2;
			} else {
				if (minHeap.size() > maxHeap.size()) {
					median = minHeap.peek();
				} else {
					median = maxHeap.peek();
				}
			}
		}
	}

	// Returns the median of current data stream
	public double findMedian() {
		return median;
	}
};

// Your MedianFinder object will be instantiated and called as such:
// MedianFinder mf = new MedianFinder();
// mf.addNum(1);
// mf.findMedian();