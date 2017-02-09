
/**
* Solution to the problem: https://leetcode.com/problems/keyboard-row/
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.

public class Solution500 {
	public init() {
	}
	
	public func findWords(_ words: [String]) -> [String] {
		let row1:[Character] = ["q", "w", "e", "r", "t", "y", "u", "i", "o", "p",
		                        "Q", "W", "E", "R", "T", "Y", "U", "I", "O", "P"]
		let row2:[Character] = ["a", "s", "d", "f", "g", "h", "j", "k", "l",
		                        "A", "S", "D", "F", "G", "H", "J", "K", "L"]
		let row3:[Character] = ["z", "x", "c", "v", "b", "n", "m",
		                        "Z", "X", "C", "V", "B", "N", "M"]
		var out = [String]()

		for word in words {
			var copy = word
			let ch = copy.remove(at: copy.startIndex)
			if(row1.contains(ch)){
				if(checkOtherRows(rowA: row2, rowB: row3, word: word)){
					out.append(word)
				}
			} else if (row2.contains(ch)) {
				if(checkOtherRows(rowA: row1, rowB: row3, word: word)){
					out.append(word)
				}
			} else {
				if(checkOtherRows(rowA: row1, rowB: row2, word: word)){
					out.append(word)
				}
			}
		}
		return out
	}
	
	func checkOtherRows(rowA: [Character], rowB: [Character], word: String) -> Bool {
		var sameRow = true
		for i in word.characters {
			if(rowA.contains(i)){
				sameRow = false
				break
			}
			if(rowB.contains(i)){
				sameRow = false
				break
			}
		}
		return sameRow
	}
}
