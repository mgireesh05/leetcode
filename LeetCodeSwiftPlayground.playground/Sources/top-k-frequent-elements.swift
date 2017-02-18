
/**
* Solution to the problem: https://leetcode.com/problems/top-k-frequent-elements/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution347 {
	public init(){
	}
	
	public func topKFrequent(_ nums: [Int], _ k: Int) -> [Int] {
		var dict = [Int: Int]()
		
		//Find the frequency of the numbers
		for i in nums {
			if(dict[i] == nil){
				dict[i] = 1
			}else{
				dict[i] = dict[i]! + 1
			}
		}
		
		//Sort the dictionary based on the values (i.e. frequency) []
		//{$1.1 < $0.1} -> sort reverse, order based on the second element of the tuple
		var sortedKeys = [Int]()
		for (key, _) in (Array(dict).sorted {$1.1 < $0.1}) {
			sortedKeys.append(key)
		}

		//Chop off the tail of the array
		sortedKeys.removeLast(sortedKeys.count - k)
		
		return sortedKeys
	}
}
