class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
       val mapCounter = hashMapOf<Int, Int>()  // val : count

    for (value in nums) {
        if (value in mapCounter && mapCounter[value] == 1) {
            return true
       } else {
        mapCounter.put(value, 1)
       }
    }
    return false
} 
}
