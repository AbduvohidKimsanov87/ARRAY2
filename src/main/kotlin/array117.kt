fun main() {
    val array= intArrayOf(7,7,7,7,8,8,8,9,9,9,9,9,2,2)
    var temp=0
    val arrayB=IntArray(2*array.size)
    var index=0
    while (index<array.size) {
        var count = 1
        for (innerindex in index + 1 until array.size) {
            if (array[index] == array[innerindex]) {
                count++


            } else {
                arrayB[innerindex+3]=array[innerindex]

                break
            }
            arrayB[innerindex]=array[innerindex]


        }

        println(count)
        index += count


    }
    println(arrayB.joinToString())


}