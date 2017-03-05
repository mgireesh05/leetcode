//: Playground - noun: a place where people can play

import Cocoa


var sol = Solution82()

var head: ListNode? = ListNode(1)
head?.next = ListNode(2)
head?.next?.next = ListNode(3)
head?.next?.next?.next = ListNode(3)
head?.next?.next?.next?.next = ListNode(4)
head?.next?.next?.next?.next?.next = ListNode(4)
head?.next?.next?.next?.next?.next?.next = ListNode(5)
var newHead = sol.deleteDuplicates(head)
ListNode.printList(head: newHead)


var head1: ListNode? = ListNode(1)
head1?.next = ListNode(1)
head1?.next?.next = ListNode(1)
head1?.next?.next?.next = ListNode(2)
head1?.next?.next?.next?.next = ListNode(3)
var newHead1 = sol.deleteDuplicates(head1)
ListNode.printList(head: newHead1)

var head2: ListNode? = ListNode(1)
head2?.next = ListNode(1)
head2?.next?.next = ListNode(2)
head2?.next?.next?.next = ListNode(3)
head2?.next?.next?.next?.next = ListNode(3)
var newHead2 = sol.deleteDuplicates(head2)
ListNode.printList(head: newHead2)
