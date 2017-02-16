//: Playground - noun: a place where people can play

import Cocoa
let root = TreeNode(1)
root.left = TreeNode(3)
root.right = TreeNode(2)
root.left?.left = TreeNode(5)
root.left?.right = TreeNode(3)
root.right?.right = TreeNode(9)

var sol = Solution515()
print(sol.largestValues(root))

