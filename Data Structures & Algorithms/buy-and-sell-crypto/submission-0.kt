class Solution {
    fun maxProfit(prices: IntArray): Int {
        var leftPointer = 0
        var rightPointer = 1
        var maxProfit = 0

        while(rightPointer < prices.size){
            if(prices[leftPointer] < prices[rightPointer]) {
                var possibleMaxProfit = prices[rightPointer] - prices[leftPointer]
                maxProfit = maxOf(maxProfit, possibleMaxProfit)
            }else{
                leftPointer = rightPointer
            } 
            rightPointer++
        }
        return maxProfit
    }
}
