class Solution {
    fun lastStoneWeight(stones: IntArray): Int {
        val maxHeap = PriorityQueue<Int>(
            compareByDescending{it}
        )
         for (s in stones) maxHeap.add(s)

        while (maxHeap.size > 1) {
            val largest = maxHeap.poll()
            val secondLargest = maxHeap.poll()
            if (largest != secondLargest) {
                maxHeap.add(largest - secondLargest)
            }
        }

        return if (maxHeap.isEmpty()) 0 else maxHeap.peek()
        
    }
}
