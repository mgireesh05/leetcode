
/**
* Solution to the problem: https://leetcode.com/problems/find-largest-value-in-each-tree-row/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution515 {
	var depth = 0
	var arr = [Int]()
	
	public init(){
	}

	public func largestValues(_ root: TreeNode?) -> [Int] {
		traverse(root, depth: 1)
		return arr
	}
	
	func traverse(_ root: TreeNode?, depth: Int) {
		if(root == nil){
			return
		}
		
		if(arr.count < depth) {
			arr.append((root?.val)!)
		} else if (arr[depth-1] < (root?.val)!){
			arr[depth-1] = (root?.val)!
		}
		
		if(root?.left != nil){
			traverse(root?.left, depth: depth + 1)
		}
		
		if(root?.right != nil){
			traverse(root?.right, depth: depth + 1)
		}
	}
}
