class Solution {
    fun canConstruct(ransomNote: String, magazine: String): Boolean {
        var countRansom = IntArray(26)
        var countMagazine = IntArray(26)

        //aa
        //aab

        for(char in ransomNote){
            countRansom[char - 'a']++
        }

        for(char in magazine){
            countMagazine[char - 'a']++
        }

        //2,0,0,0...
        //2,1,0,0...

        //if some letter present in ransom is not in magazine -> false
        
        for (i in 0 until 26) {
            if (countMagazine[i] < countRansom[i]) return false
        }

        return true

    }
}
