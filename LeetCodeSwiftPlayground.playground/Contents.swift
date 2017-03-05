//: Playground - noun: a place where people can play

import Cocoa


var sol = Solution73()

var matrix = [[1,1,1],
              [2,2,2],
              [3,3,0],
              [0,1,1]]
sol.setZeroes(&matrix)
print(matrix)