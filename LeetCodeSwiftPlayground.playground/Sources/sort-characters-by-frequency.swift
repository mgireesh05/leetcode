
/**
* Solution to the problem: https://leetcode.com/problems/sort-characters-by-frequency/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution451 {
	public init(){
	}
	
	public func frequencySort(_ s: String) -> String {
		var dict = [Character : Int]()
		for c in s.characters {
			if(dict[c] == nil){
				dict[c] = 1
			}else{
				dict[c] = dict[c]! + 1
			}
		}
		
		var sortedString = ""
		for (key, val) in (Array(dict).sorted {$1.1 < $0.1}) {
			for _ in 1...val {
				sortedString.append(key)
			}
		}
		
		return sortedString
	}
}
