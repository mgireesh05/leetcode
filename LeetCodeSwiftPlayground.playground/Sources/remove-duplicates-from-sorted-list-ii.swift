/**
* Solution to the problem: https://leetcode.com/problems/remove-duplicates-from-sorted-list-ii
*/

//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution82 {

	public init() {
	}
	
	public func deleteDuplicates(_ head: ListNode?) -> ListNode? {
		if(head == nil || head?.next == nil){
			return head
		}
				
		var temp = head
		var newhead: ListNode? = nil
		if(head?.val != head?.next?.val){
			newhead = head
		}
		
		var t1 = temp
		var t2 = temp?.next
		while((temp != nil) && (t1 != nil) && (t2 != nil)){
			while((t1 != nil) && (t2 != nil) && (t1?.val == t2?.val)) {
				t1 = t1?.next
				t2 = t2?.next
			}
			if((t2?.next != nil) && (t2?.val == t2?.next?.val)) {
				t1 = t2
				t2 = t2?.next
			} else {
				if(newhead == nil){
					newhead = t2
					temp = newhead
				} else {
					temp?.next = t2
					temp = t2
				}
				t1 = t2
				t2 = t2?.next
			}
		}
				
		temp?.next = nil
				
		return newhead
	}
}

