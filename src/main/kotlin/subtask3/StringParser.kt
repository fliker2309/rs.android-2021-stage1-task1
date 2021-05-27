
package subtask3

class StringParser {

    fun getResult(inputString: String): Array<String> {
        val mapOfBrackets = mutableMapOf(
            '<' to '>',
            '(' to ')',
            '[' to ']'
        )
        val outputArray = ArrayList<String>()
        val tempString = StringBuilder(inputString)
        var lastElement = 0

        for (i in tempString.length - 1 downTo 0) {
            if (tempString[i] in mapOfBrackets.keys) {

                for (item in i..tempString.length) {
                    if (tempString[item] == mapOfBrackets[inputString[i]]) {
                        lastElement = item
                        tempString.replace(i, i + 1, " ")
                        tempString.replace(lastElement, lastElement + 1, " ")
                        break
                    }
                }
                outputArray.add(0, inputString.substring(i + 1, lastElement))
            }
        }
        return outputArray.toTypedArray()
    }
}