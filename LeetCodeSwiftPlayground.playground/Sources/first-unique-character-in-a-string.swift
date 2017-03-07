/**
* Solution to the problem: https://leetcode.com/problems/first-unique-character-in-a-string
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution387 {
	
	public init(){
	}
	
	public func firstUniqChar(_ s: String) -> Int {
		var dict = [Character: (count: Int, index: Int)]()
		var index = 0
		for c in s.characters {
			if(dict[c] == nil){
				dict[c] = (count: 1, index: index)
			}else{
				dict[c] = ((dict[c]?.count)! + 1, index: index)
			}
			index = index + 1
		}
		
		index = 0x7FFFFFFF
		for item in dict {
			if(item.value.count == 1) {
				index = min(index, item.value.index)
			}
		}
		
		return index == 0x7FFFFFFF ? -1 : index
	}
}


