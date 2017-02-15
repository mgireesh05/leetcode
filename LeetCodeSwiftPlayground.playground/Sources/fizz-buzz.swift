
/**
* Solution to the problem: https://leetcode.com/problems/fizz-buzz/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution412 {
	public init(){
	}
	
	public func fizzBuzz(_ n: Int) -> [String] {
		var arr = [String]()
		
		for i in 1...n {
			if((i % 3 == 0) && (i % 5 == 0)){
				arr.append("FizzBuzz")
			}else if(i % 3 == 0){
				arr.append("Fizz")
			}else if(i % 5 == 0){
				arr.append("Buzz")
			}else{
				arr.append("\(i)")
			}
		}
		
		return arr
	}
}
