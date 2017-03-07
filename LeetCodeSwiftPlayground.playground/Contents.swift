//: Playground - noun: a place where people can play

import Cocoa


var sol = Solution450()

let root: TreeNode? = TreeNode(5)
root?.left = TreeNode(3)
root?.right = TreeNode(6)
root?.left?.left = TreeNode(2)
root?.left?.right = TreeNode(4)
root?.right?.right = TreeNode(7)

sol.deleteNode(root, 3)
