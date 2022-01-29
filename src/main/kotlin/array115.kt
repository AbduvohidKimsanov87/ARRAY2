fun main() {
    val array= intArrayOf(9,7,5,19,15,22,6,4,11,17)
    val arrayA=IntArray(array.size)
    println(array.joinToString())
    for (outerindex in 0 until array.size) {
        for (innerindex in 0 until array.size-1) {
            if (array[innerindex]>array[innerindex+1]){
                val temp=array[innerindex+1]
                array[innerindex+1]=array[innerindex]
                array[innerindex]=temp

            }


        }

    }
    println(array.joinToString())
}