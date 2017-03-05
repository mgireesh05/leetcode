
/**
* Solution to the problem: https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution448 {
	public init(){
	}
	
	public func findDisappearedNumbers(_ nums: [Int]) -> [Int] {
		//Since Swift passes array as immutable, the given prototype on leetcode does not allow to solve the problem without using extra space. (Sent a feedback to them)
		if(nums.count < 1){
			return []
		}
		
		var numsCopy = nums
		var arr = [Int]()
		for i in nums {
			numsCopy[i-1] = 0
		}
		
		for i in 1...nums.count {
			if(numsCopy[i-1] != 0){
				arr.append(i)
			}
		}

		return arr
	}
	
	//This should have been the prototype for this problem
	public func findDisappearedNumbers1(nums: inout [Int]) -> [Int] {
		if(nums.count < 1){
			return []
		}

		var arr = [Int]()
		for i in nums {
			nums[i-1] = 0
		}
		
		for i in 1...nums.count {
			if(nums[i-1] != 0){
				arr.append(i)
			}
		}
		
		return arr
	}
}
