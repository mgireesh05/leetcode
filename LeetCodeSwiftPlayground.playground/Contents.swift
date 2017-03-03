//: Playground - noun: a place where people can play

import Cocoa

let root = TreeNode(4)
root.left = TreeNode(2)
root.right = TreeNode(6)
root.left?.left = TreeNode(7)
root.left?.right = TreeNode(3)
root.right?.left = TreeNode(5)
root.right?.right = TreeNode(1)

var sol = Solution99()

print("Before")
sol.printInorder(root)
sol.recoverTree(root)
print("After")
sol.printInorder(root)
