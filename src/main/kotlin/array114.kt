fun main() {
    val array = intArrayOf(5, 8, 6, 9, 12, 15, 7, 22, 4, 8, 14)
    println(array.joinToString())
    var sorted=true
    for (indix in 0 until array.size){
        sorted=true
        for (index in 2 until array.size) {
            if (array[index] < array[index - 1] && array[index] > array[index - 2]) {
                sorted=false
                val temp = array[index]
                array[index] = array[index - 1]
                array[index - 1] = temp
            }
            if (array[index] >= array[index - 2] && array[index] >= array[index - 1]) {
                continue
            } else {
                sorted=false
                val temp = array[index]
                val sum=array[index-2]
                array[index] = array[index - 1]
                array[index - 1] = temp
                array[index - 2] = array[index-1]
                array[index - 1] = sum
            }


        }
        if (sorted){
            break
        }

        println(array.joinToString())

    }

    println(array.joinToString())
}