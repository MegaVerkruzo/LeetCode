package algorithmTasks.validParenthesis

class Solution {
    private fun getLeftBracket(c: Char): Char = when(c) {
        ')' -> '('
        '}' -> '{'
        ']' -> '['
        else -> '\u0000'
    }

    fun isValid(s: String): Boolean {
        val leftBrackets: Set<Char> = setOf('(', '{', '[')
        val stack = arrayListOf<Char>()
        for (i in 0..s.lastIndex) {
            if (leftBrackets.contains(s[i])) {
                stack.add(s[i])
            } else if (stack.isNotEmpty() && stack[stack.lastIndex] == getLeftBracket(s[i])) {
                stack.removeLast()
            } else {
                return false
            }
        }
        return true
    }
}