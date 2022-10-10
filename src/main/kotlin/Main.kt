import algorithmTasks.mergeTwoSortedLists.ListNode
import algorithmTasks.mergeTwoSortedLists.Solution

fun printing(printList : ListNode) {
    println(printList.`val`)
    printing(printList.next ?: return)
}

fun main() {
    val list1: ListNode? = null

    val list2: ListNode? = null
    val resultList: ListNode? = Solution().mergeTwoLists(list1, list2)
    printing(resultList ?: return)
}