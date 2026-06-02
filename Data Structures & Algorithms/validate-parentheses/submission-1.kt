class Solution {
     fun isValid(s: String): Boolean {
        // a map to know which are the acepted parentheses pairs
        // why close to open and not open to closed?
        //it could be, but then, we should add to the stack the closed ones instead


        val parenthesesMap = hashMapOf(
            ')' to '(',
            '}' to '{',
            ']' to '[',
        )

        //LIFO
        //"([{}])"
        // a stack to keep track of open parentheses
        val openStack = ArrayDeque<Char>()

        for(char in s){
            if(openStack.isNotEmpty() && openStack.peek() == parenthesesMap[char]) {
                openStack.pop()
            }else{
                openStack.push(char)
            }
        }
        return openStack.isEmpty()
    }
}
