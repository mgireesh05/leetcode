/**
* Solution to the problem: https://leetcode.com/problems/set-matrix-zeroes/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution73 {
	public init(){
	}
	
	public func setZeroes(_ matrix: inout [[Int]]) {
		var rowSet = Set<Int>()
		var colSet = Set<Int>()

		for row in 0...matrix.count-1 {
			for col in 0...matrix[0].count-1 {
				if(matrix[row][col] == 0){
					rowSet.insert(row)
					colSet.insert(col)
				}
			}
		}

		for row in 0...matrix.count-1 {
			for col in 0...matrix[0].count-1 {
				if(rowSet.contains(row) || colSet.contains(col)){
					matrix[row][col] = 0
				}
			}
		}
	}
}
