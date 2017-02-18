//: Playground - noun: a place where people can play

import Cocoa

let root = TreeLinkNode(1)
root.left = TreeLinkNode(2)
root.right = TreeLinkNode(3)
root.left?.left = TreeLinkNode(4)
root.left?.right = TreeLinkNode(5)
root.right?.left = TreeLinkNode(6)
root.right?.right = TreeLinkNode(7)

var sol = Solution116_and_117()
sol.connect(root)
sol.printLinks(root)

print()

let root1 = TreeLinkNode(1)
root1.left = TreeLinkNode(2)
root1.right = TreeLinkNode(3)
root1.left?.left = TreeLinkNode(4)
root1.left?.right = TreeLinkNode(5)
root1.right?.right = TreeLinkNode(7)

var sol1 = Solution116_and_117()
sol1.connect(root1)
sol1.printLinks(root1)
