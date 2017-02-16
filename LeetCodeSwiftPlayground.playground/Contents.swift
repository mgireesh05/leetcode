//: Playground - noun: a place where people can play

import Cocoa
let head = ListNode(1)
head.next = ListNode(2)
head.next?.next = ListNode(3)
head.next?.next?.next = ListNode(4)
head.next?.next?.next?.next = ListNode(5)
let obj = Solution382(listHead: head)

for i in 1...10 {
	var param_1 = obj.getRandom()
	print(param_1)
}


