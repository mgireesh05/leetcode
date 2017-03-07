/**
* Solution to the problem: https://leetcode.com/problems/delete-node-in-a-bst/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution450 {
	
	public init(){
	}
	
	public func deleteNode(_ root: TreeNode?, _ key: Int) -> TreeNode? {
		
		if(root == nil){
			return nil
		}
		
		if(key < (root?.val)!){
			//Key smaller than the the current root, so find it in the left subtree
			root?.left = deleteNode(root?.left, key)
		}else if (key > (root?.val)!){
			//Key larger than the the current root, so find it in the right subtree
			root?.right = deleteNode(root?.right, key)
		} else {
			if(root?.left == nil){
				//Key is in the current root and left branch is empty, delete the root and return the right as the new root
				return root?.right
			}else if(root?.right == nil) {
				//Key is in the current root and right branch is empty, delete the root and return the left as the new root
				return root?.left
			}else{
				//Key is in the current root and left and right are not empty. Find the min in the right subtree, copy the min to the root, and recursively delete that value from the right subtree
				let node: TreeNode? = minNode(root?.right)
				root?.val = (node?.val)!
				root?.right = deleteNode(root?.right, (node?.val)!)
			}
		}
		
		return root
	}
	
	func minNode(_ root: TreeNode?) -> TreeNode {
		var node = root
		while(node?.left != nil){
			node = node?.left
		}
		return node!
	}
}
