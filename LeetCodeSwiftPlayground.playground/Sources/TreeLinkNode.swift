import Foundation

/**
* Definition for a binary tree node.
*/
public class TreeLinkNode {
	public var val: Int
	public var left: TreeLinkNode?
	public var right: TreeLinkNode?
	public var next: TreeLinkNode?
	
	public init(_ val: Int) {
		self.val = val
		self.left = nil
		self.right = nil
		self.next = nil
	}
}
