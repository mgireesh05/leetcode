
/**
* Solution to the problem: https://leetcode.com/problems/populating-next-right-pointers-in-each-node/ and https://leetcode.com/problems/populating-next-right-pointers-in-each-node-ii
*/


//Note: The number here denotes the problem id in leetcode. This is to avoid name conflict with other solution classes in the Swift playground.
public class Solution116_and_117 {
	
	public init(){
	}

	var dict = [Int: TreeLinkNode?]()
	public func connect(_ root: TreeLinkNode?) {
		dict[1] = nil
		deepConnect(root, depth: 1)
	}
	
	func deepConnect(_ root: TreeLinkNode?, depth: Int){
		if(root == nil){
			return
		}

		if(root?.right != nil){
			deepConnect(root?.right, depth: depth + 1)
		}
		
		if(dict[depth] == nil) {
			root?.next = nil
		}else{
			root?.next = dict[depth]!
		}
		
		dict[depth] = root
		
		if(root?.left != nil){
			deepConnect(root?.left, depth: depth + 1)
		}
	}
	
	public func printLinks(_ root: TreeLinkNode?) {
		if(root == nil){
			return
		}
		
		print("\(root?.val ?? 0)->\(root?.next?.val ?? 0)")
		
		if(root?.left != nil) {
			printLinks(root?.left)
		}
		
		if(root?.right != nil) {
			printLinks(root?.right)
		}
	}
}

//Swift is not available for this problem on OJ. So tested with Java. 

/*
import java.util.HashMap;
public class Solution {

	HashMap<Integer, TreeLinkNode> map = new HashMap<Integer, TreeLinkNode>();

	public void connect(TreeLinkNode root) {
		map.put(1, null);
		deepConnect(root, 1);
	}

	void deepConnect(TreeLinkNode root, Integer depth){
		if(root == null){
			return;
		}

		if(root.right != null){
			deepConnect(root.right, depth + 1);
		}

		if(map.get(depth) == null) {
			root.next = null;
		}else{
			root.next = map.get(depth);
		}

		map.put(depth, root);

		if(root.left != null){
			deepConnect(root.left, depth + 1);
		}
	}

	public void printLinks(TreeLinkNode root) {
		if(root == null){
			return;
		}

		if(root.next != null) {
			System.out.println(root.val + "->" + root.next.val);
		}else{
			System.out.println(root.val + "->" + "NULL");
		}

		if(root.left != null) {
			printLinks(root.left);
		}

		if(root.right != null) {
			printLinks(root.right);
		}
	}
}

*/
