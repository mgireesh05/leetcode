//: Playground - noun: a place where people can play

import Cocoa


var sol = Solution530()


//543,384,652,null,445,null,699]
//[1,null,5,3]
var root: TreeNode? = TreeNode(1)
//root?.left = TreeNode(0)
root?.right = TreeNode(5)
root?.right?.left = TreeNode(3)
//root?.left?.right = TreeNode(445)
//root?.right?.left = TreeNode(0)
//root?.right?.right = TreeNode(699)

print(sol.getMinimumDifference(root))