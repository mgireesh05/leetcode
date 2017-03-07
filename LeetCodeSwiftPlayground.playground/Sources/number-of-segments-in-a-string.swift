/**
* Solution to the problem: https://leetcode.com/problems/number-of-segments-in-a-string/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution434 {
	public init(){
	}
	
	public func countSegments(_ s: String) -> Int {
		return s.characters.split(separator: " ").count
	}
}
