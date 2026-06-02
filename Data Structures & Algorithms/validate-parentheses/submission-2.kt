class Solution {
     fun isValid(s: String): Boolean {
        // a map to know which are the acepted parentheses pairs

        val closeToOpenMap = hashMapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )

        //LIFO
        //"([{}])"
        // a stack to keep track of open parentheses
        val openStack = ArrayDeque<Char>()

        for(char in s){
            if(closeToOpenMap.containsKey(char)){
                if(openStack.isNotEmpty() && openStack.peek() == closeToOpenMap[char]){
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
