class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        var k = 0
        for(element in nums){
            if(element != `val`){
                nums[k] = element
                k++
            }
        }
        return k
    }
}