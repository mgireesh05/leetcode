//: Playground - noun: a place where people can play

import Cocoa


var str = "Hello, playground"

let root = TreeNode(3)
root.left = TreeNode(9)
root.right = TreeNode(20)
root.right?.left = TreeNode(15)
root.right?.right = TreeNode(7)

let sol = Solution()
print(sol.sumOfLeftLeaves(root))
