class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val aux = hashMapOf<Int, Int>() // value : count
        for(value in nums){
            if(value in aux){
                aux[value] = aux.getValue(value) + 1 
            } else {
                aux.put(value, 1)
            }
        }   
    return aux.entries
    .sortedByDescending { it.value }
    .take(k)
    .map { it.key }
    .toIntArray()
    }
}
