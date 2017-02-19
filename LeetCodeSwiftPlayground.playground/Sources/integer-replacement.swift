
/**
* Solution to the problem: https://leetcode.com/problems/integer-replacement/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.

public class Solution397 {
	public init() {
	}
	
	var dict = [Int: Int]()
	public func integerReplacement(_ n: Int) -> Int {
		if(n == 1){
			return 0
		}
		
		if(dict[n] != nil){
			return dict[n]!
		}
		
		
		/* The logic is very similar to solving fibonacci using DP. Save the computed
		subproblems (f(n/2) or f(n-1) or f(n+1)) in a dictionary and look them up when
		encountered instead of recomputing. This will solve the problem in linear time 
		which would	otherwise will be exponential.
		*/
		var minVal = 0
		if(n%2 == 0){
			let min0 = integerReplacement(n/2)
			dict[n/2] = min0
			
			minVal = min0 + 1
		}else{
			let min0 = integerReplacement(n+1)
			dict[n+1] = min0
			
			let min1 = integerReplacement(n-1)
			dict[n-1] = min1
			
			minVal = min(min0, min1) + 1
		}
		
		return minVal
	}
}

