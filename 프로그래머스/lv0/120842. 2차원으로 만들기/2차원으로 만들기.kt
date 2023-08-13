class Solution {
    fun solution(num_list: IntArray, n: Int): Array<IntArray> {
        val answer: List<List<Int>> = num_list.toList().chunked(n)
        return answer.map { it.toIntArray() }.toTypedArray()
    }
}
