package subtask2

class BillCounter {
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        return when (val result = (bill.sum() - bill[k]) / 2) {
            b -> "Bon Appetit"
            else -> (b - result).toString()
        }
    }
}