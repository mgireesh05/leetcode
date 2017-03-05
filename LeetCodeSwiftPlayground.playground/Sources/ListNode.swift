import Foundation

/**
* Definition for a linked list node.
*/
public class ListNode {
	public var val: Int
	public var next: ListNode?
	
	public init(_ val: Int) {
		self.val = val
		self.next = nil
	}
	
	//Class method to print the list in the form 1->2->3->4
	public class func printList(head: ListNode?) {
		if(head == nil){
			print("nil")
			return
		}
		
		var temp = head
		while(temp?.next != nil) {
			print((temp?.val)!, terminator: "->")
			temp = (temp?.next)!
		}
		print("\((temp?.val)!)")
	}
}
