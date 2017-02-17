//: Playground - noun: a place where people can play

import Cocoa

let root = TreeNode(1)
root.left = TreeNode(2)
root.right = TreeNode(3)
root.left?.left = TreeNode(4)
root.right?.left = TreeNode(5)
root.right?.right = TreeNode(6)
root.right?.left?.left = TreeNode(7)

var sol = Solution508()
print(sol.findFrequentTreeSum(root))
