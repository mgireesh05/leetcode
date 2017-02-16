/**
* Solution to the problem: https://leetcode.com/problems/linked-list-random-node/
*/

import Darwin

//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.

public class Solution382 {
	var len = UInt32(INT_MAX)
	var head: ListNode? = nil
	
	/** @param head The linked list's head.
	Note that the head is guaranteed to be not null, so it contains at least one node. */
	public init(listHead lhead: ListNode) {
		head = lhead
	}
	
	/** Returns a random node's value. */
	public func getRandom() -> Int {
		let num = UInt32(arc4random_uniform(len))
		var count: UInt32 = 0
		var output = 0
		var temp: ListNode? = head
		while(num <= len){
			if(temp?.next == nil){
				len = count + 1
				output = (temp?.val)!
				break
			}
			if(num == count){
				output = (temp?.val)!
				break
			}
			temp = temp?.next
			count = count + 1
		}
		
		return output
	}
}

/**
* Your Solution object will be instantiated and called as such:
* Solution obj = new Solution(head);
* int param_1 = obj.getRandom();
*/



/** Swift is not available for this problem at the moment. So tested with a Java rewrite.

public class Solution {
	int len = Integer.MAX_VALUE;
	ListNode head = null;

	/** @param head The linked list's head.
	Note that the head is guaranteed to be not null, so it contains at least one node. */
	public Solution(ListNode head) {
		this.head = head;
	}

	/** Returns a random node's value. */
	public int getRandom() {
		int num = (int)(Math.random() * len);
		int count = 0;
		int output = 0;
		ListNode temp = head;
		while(num <= len){
			if(temp.next == null){
				len = count + 1;
				output = temp.val;
				break;
			}
			if(num == count){
				output = temp.val;
				break;
			}
			temp = temp.next;
			count = count + 1;
		}

		return output;
	}
}

*/
