//: Playground - noun: a place where people can play

import Cocoa


var sol = Solution501()


var root: TreeNode? = TreeNode(1)
root?.right = TreeNode(2)
root?.right?.left = TreeNode(2)
root?.right?.right = TreeNode(3)
root?.right?.right?.right = TreeNode(3)


print(sol.findMode(root))