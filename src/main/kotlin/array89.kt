fun main() {
    var k=0
    var indexk=0
    val array = intArrayOf(12, 14, 17, 22, 25, 18, 29, 35, 47)
    for (index in 1 until array.size - 1) {
        if (array[index] < array[index + 1] && array[index] < array[index - 1]) {
            var k = array[index]
            indexk = index
            println("$k $indexk")

        }

    }
    for (index in 0 until array.size - 2){
    if (k > array[index + 1]) {

        if (array[index + 1] > k) {
                break
            }
            val sum = array[index + 1]
            array[index + 1] = k
            k = sum
        }
    }
    for (index in array.size - 2 downTo 1) {
    if (k < array[index + 1]) {

        if (k > array[index - 1]) {

        }
        var sum = array[index-1]
        array[index - 1] = k
        array[index]=sum

    }
    }


    println(array.joinToString())
}