class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        val countRansom = IntArray(26) 
        val countMagazine = IntArray(26)

        for(c in ransomNote){
            countRansom[c - 'a']++
        }

        for(c in magazine){
            countMagazine[c - 'a']++
        }


        for(i in countRansom.indices){
            if(countMagazine[i] < countRansom[i]){
                return false
            }
        }
        return true

    }
}
