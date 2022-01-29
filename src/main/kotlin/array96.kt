fun main() {
    var array= intArrayOf(5,6,3,5,7,3,9,8,2,9,4,7,6,5,8,3)
    var arrraA=IntArray(array.size)
    var count=0
    println(array.joinToString())
    for (outerindex in 0 until array.size){
        for (innerIndex in 1 until array.size-1){
            if (array[outerindex]==array[innerIndex]){
                var sum=array[innerIndex+1]
                array[innerIndex+1]=array[innerIndex]
                array[innerIndex]=sum

            }


        }
    }
    println(array.joinToString())
}