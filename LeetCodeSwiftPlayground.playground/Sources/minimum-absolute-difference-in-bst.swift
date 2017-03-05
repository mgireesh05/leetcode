/**
* Solution to the problem: https://leetcode.com/problems/minimum-absolute-difference-in-bst/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution530 {
	
	public init(){
	}
	
	var prev: TreeNode? = nil
	var minDiff = 0x7FFFFFFF
	public func getMinimumDifference(_ root: TreeNode?) -> Int {
		if(root == nil){
			return minDiff
		}
		
		_ = getMinimumDifference(root?.left)
		
		if(prev != nil) {
			minDiff = min(minDiff, abs((prev?.val)! - (root?.val)!))
		}
		prev = root
		
		_ = getMinimumDifference(root?.right)
			
		return minDiff
	}
}
