
/**
* Solution to the problem: https://leetcode.com/problems/find-all-duplicates-in-an-array/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution442 {
	public init(){
	}
	
	public func findDuplicates(_ nums: [Int]) -> [Int] {
		//Since Swift passes array as immutable, the given prototype on leetcode does not allow to solve the problem without using extra space. (Sent a feedback to them)
		var numsCopy = nums
		var arr = [Int]()
		for i in nums {
			if(numsCopy[i-1] < 0){
				arr.append(i)
			}else{
				numsCopy[i-1] = nums[i-1] * -1
			}
		}
		return arr
	}
	
	//This should have been the prototype for this problem
	public func findDuplicates1(nums: inout [Int]) -> [Int] {
		var arr = [Int]()
		for var i in nums {
			i = abs(i)
			if(nums[i-1] < 0){
				arr.append(i)
			}else{
				nums[i-1] = nums[i-1] * -1
			}
		}
		return arr
	}
}
