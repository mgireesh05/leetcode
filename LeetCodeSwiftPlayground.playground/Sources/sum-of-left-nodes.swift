
/**
* Solution to the problem: https://leetcode.com/problems/sum-of-left-leaves/
*/


public class Solution {
	public init() {
	}

	var arr = [Int]()
	public func sumOfLeftLeaves(_ root: TreeNode?) -> Int {
		findSum(root, isLeft: false)
		var sum = 0
		for i in arr {
			sum += i
		}
		return sum
	}

	func findSum(_ root: TreeNode?, isLeft: Bool) {
		if(root == nil){
			return;
		}

		if(root?.left != nil){
			findSum(root?.left, isLeft:true);
		}

		if(root?.right != nil){
			findSum(root?.right, isLeft:false);
		}

		if(root?.left == nil && root?.right == nil){
			if(isLeft){
				arr.append((root?.val)!);
			}
			return;
		}
	}
}
