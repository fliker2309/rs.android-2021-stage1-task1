package subtask1

class HappyArray {

     fun convertToHappy(sadArray: IntArray): IntArray {

        if (sadArray.size <= 2) {
            return sadArray
        }

        var happyArray: MutableList<Int> = mutableListOf()
        happyArray.add(sadArray[0])
        var previousElement = sadArray[0]
        var i = 1

        while (i != sadArray.size - 1) {
            val nextElement = sadArray[i + 1]

            if (previousElement + nextElement > sadArray[i]) {
                previousElement = sadArray[i]
                happyArray.add(previousElement)
                i++
            } else i++
        }

        happyArray.add(sadArray[sadArray.size - 1])

        if (sadArray.size != happyArray.size)
            happyArray = convertToHappy(happyArray.toIntArray()).toMutableList()

        return happyArray.toIntArray()
    }
}
