package subtask1

class HappyArray {

    fun convertToHappy(sadArray: IntArray): IntArray {
        val tempArray = sadArray.toMutableList()

        var isHappy = true

        while (isHappy) {
            isHappy = false
            var i = 0
            for (j in 1..tempArray.size - 2) {
                if (tempArray[j - i] > tempArray[j - 1 - i] + tempArray[j + 1 - i]) {
                    isHappy = true
                    tempArray.removeAt(j - i)
                    i++
                }
            }
        }
        return tempArray.toIntArray()
    }


}