/**
* Solution to the problem: https://leetcode.com/problems/detect-capital/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution520 {
	public init(){
	}
	
	public func detectCapitalUse(_ word: String) -> Bool {
		let index = word.index(word.startIndex, offsetBy: 1)
		let s0 = word.substring(to: index)
		let s1 = word.substring(from: index)
		
		if(isAllUpperCase(s0)){
			if(isAllLowerCase(s1) || isAllUpperCase(s1)){
				return true
			}
		}else{
			if(isAllLowerCase(s1)){
				return true
			}
		}
		
		return false
	}
	
	func isAllUpperCase(_ word: String) -> Bool {
		for c in word.characters{
			if(c >= "a" && c <= "z") {
				return false
			}
		}
		return true
	}
	
	func isAllLowerCase(_ word: String) -> Bool {
		for c in word.characters{
			if(c >= "A" && c <= "Z") {
				return false
			}
		}
		return true
	}
}


