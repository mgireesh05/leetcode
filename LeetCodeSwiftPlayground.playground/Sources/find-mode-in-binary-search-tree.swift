/**
* Solution to the problem: https://leetcode.com/problems/find-mode-in-binary-search-tree/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution501 {
	
	public init(){
	}
	
	var count = 0
	var prevCount = 0
	var prev: TreeNode? = nil
	var set = Set<Int>()
	public func findMode(_ root: TreeNode?) -> [Int] {
		if(root == nil){
			return []
		}
		
		_ = findMode(root?.left)
		
		if(prev != nil) {
			if(prev?.val == root?.val) {
				count = count + 1
				if(count > prevCount) {
					prevCount = count
					set.removeAll()
					set.insert((root?.val)!)
				}else if (count == prevCount){
					if(count == prevCount){
						set.insert((prev?.val)!)
					}
				}
			}else{
				if(count == prevCount){
					set.insert((prev?.val)!)
				}
				if(prevCount == 1){
					set.insert((root?.val)!)
				}
				count = 1
			}
		}else{
			set.insert((root?.val)!)
			count = 1
			prevCount = count
		}
		prev = root
		
		_ = findMode(root?.right)
		
		return Array(set)
	}
}
