class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = HashMap<List<Int>, MutableList<String>>()

        for (s in strs) {
            val charCount = MutableList(26) { 0 }
            for (c in s) {
                charCount[c - 'a']++
            }
            result.getOrPut(charCount) { mutableListOf() }.add(s)
        }

        return result.values.toList()
    }
}
