
/**
* Solution to the problem: https://leetcode.com/problems/recover-binary-search-tree/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution99 {
	
	public init(){
	}
	
	var first: TreeNode? = nil
	var second: TreeNode? = nil
	var prev: TreeNode? = nil
	public func recoverTree(_ root: TreeNode?) {
		traverse(root)
		let temp = first?.val
		first?.val = (second?.val)!
		second?.val = temp!
	}

	func traverse(_ root: TreeNode?) {
		if(root == nil){
			return
		}
		
		if(root?.left != nil){
			traverse(root?.left)
		}
		
		if(prev != nil){
			if((root?.val)! <= (prev?.val)!){
				if(first == nil){
					first = prev
				}
				
				if(first != nil){
					// For a BST (inorder) 7 2 3 4 5 6 1, where 1 and 7 are swapped, "second" will be assigned to 2 first, and then later it will be reassigned to 1
					// For a BST (inorder) 1 3 2 4 5 6 7, where 2 and 3 are swapped, "second" will be assigned to 2 and then there won't be any irregularities found later
					second = root
				}
			}
		}
		
		prev = root
		
		if(root?.right != nil){
			traverse(root?.right)
		}
	}
	
	public func printInorder(_ root: TreeNode?) {
		if(root == nil){
			return
		}
		
		if(root?.left != nil){
			printInorder(root?.left)
		}
		
		print(root?.val ?? 0)
		
		if(root?.right != nil){
			printInorder(root?.right)
		}
	}	
}


