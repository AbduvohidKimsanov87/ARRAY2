fun main() {
    var array= intArrayOf(8,5,6,2,9,1,2,8,4,9,12,35,8,9)
    println(array.joinToString())
    for (outerindex in 1 until array.size){
        for (index in 0 until array.size-1){
            if (array[index]>array[index+1]){
                var number=array[index+1]
                array[index+1]=array[index]
                array[index]=number
            }
        }

    }
    println(array.joinToString())

}