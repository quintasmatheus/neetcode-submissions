class Solution {
     fun isValid(s: String): Boolean {
        val closeToOpenMap: Map<Char, Char> = hashMapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )
        val openStack = ArrayDeque<Char>()

        for(char in s){
            if(closeToOpenMap.containsKey(char)){
                if(openStack.isNotEmpty() && closeToOpenMap[char] == openStack.peek()){
                    openStack.pop()
                }else{
                    return false
                }
            }else{
                openStack.push(char)
            }
        }
        return openStack.isEmpty()
    }
}
