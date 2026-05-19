class Solution {
    fun calPoints(operations: Array<String>): Int {
        var filteredOperations = mutableListOf<Int>()

        for (op in operations){
           when(op) {
            "+" -> {
                //sum the last two
                // 1, 2
                val top = filteredOperations.removeLast()
                // 1
                val newTop = top + filteredOperations.last()
                //3
                filteredOperations.add(top)
                //1, 2
                filteredOperations.add(newTop)
                //1,2,3

                // why all this?
                //in a stack, we only have access to the last item, so to have the
                // last and the penultimate, we need to remove the top, in order to the
                //penultimate to become the "newTop", now we have access to both values
                //we add previous top we removed, back again
                //and then, the new one
            }
            "D" -> {
                val doubleTop = filteredOperations.last() * 2
                filteredOperations.add(doubleTop)
            }
            "C" -> {
                filteredOperations.removeLast()
            }
            else -> {
                filteredOperations.add(op.toInt())
            }
           }
        }
       return filteredOperations.sum()
    }
}
