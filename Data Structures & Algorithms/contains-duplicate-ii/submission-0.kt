class Solution {
    fun containsNearbyDuplicate(nums: IntArray, k: Int): Boolean {
        val seenMap = hashMapOf<Int, Int>()
        for(i in nums.indices){
            if(nums[i] in seenMap && abs(i - seenMap[nums[i]]!!) <= k){
                return true
            }else{
                seenMap[nums[i]] = i
            }
        }
        return false
    }
}
