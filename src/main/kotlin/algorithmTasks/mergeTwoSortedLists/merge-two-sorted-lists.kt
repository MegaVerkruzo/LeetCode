package algorithmTasks.mergeTwoSortedLists

import kotlin.math.min

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

class Solution {
    fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? = when {
        list1 == null -> list2
        list2 == null -> list1
        list1.`val` < list2.`val` -> {
            val resultList = ListNode(list1.`val`)
            resultList.next = mergeTwoLists(list1.next, list2)
            resultList
        }
        else -> {
            val resultList = ListNode(list2.`val`)
            resultList.next = mergeTwoLists(list1, list2.next)
            resultList
        }
    }
}