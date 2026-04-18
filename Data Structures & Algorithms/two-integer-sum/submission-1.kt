class Solution {
   fun twoSum(nums: IntArray, target: Int): IntArray {
    val prevMap = hashMapOf<Int, Int>()  // val : index
    for ((index, value) in nums.withIndex() ) {
        val diff = target - value
        if (diff in prevMap) {
            return intArrayOf(prevMap[diff]!!, index)
        } else {
            prevMap[value] = index        }
    }
    return intArrayOf()
}
}
