
/**
* Solution to the problem: https://leetcode.com/problems/most-frequent-subtree-sum/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution508 {
	var dict = [Int: Int]()
	
	public init(){
	}
	
	public func findFrequentTreeSum(_ root: TreeNode?) -> [Int] {
		
		_ = traverse(root)

		let max = dict.values.max()
		
		var arr = [Int]()
		for item in dict {
			if(item.value == max) {
				arr.append(item.key)
			}
		}
		
		return arr
	}
	
	func traverse(_ root: TreeNode?) -> Int {
		var leftSum = 0
		var rightSum = 0
		var sum = 0
		
		if(root == nil){
			return 0
		}
		
		if(root?.left != nil){
			leftSum = traverse(root?.left)
		}
		
		if(root?.right != nil){
			rightSum = traverse(root?.right)
		}
		
		sum = leftSum + (root?.val)! + rightSum
		
		if(dict[sum] != nil) {
			dict[sum] = dict[sum]! + 1
		}else{
			dict[sum] = 1
		}
		
		return sum
	}
}
