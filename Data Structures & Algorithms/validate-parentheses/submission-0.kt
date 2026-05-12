class Solution {
     fun isValid(s: String): Boolean {
        val openCharStack = ArrayDeque<Char>()
        val closeToOpenMap = hashMapOf(')' to '(', ']' to '[', '}' to '{')

        for (char in s) {
            if (closeToOpenMap.containsKey(char)) {
                if (openCharStack.isNotEmpty() && openCharStack.first() == closeToOpenMap[char]) {
                    openCharStack.removeFirst()
                } else {
                    return false
                }
            } else {
                openCharStack.addFirst(char)
            }
        }

        return openCharStack.isEmpty()
    }
}
