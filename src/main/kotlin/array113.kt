fun main() {// selection sort-tanlash tartibi
    val array= intArrayOf(15,28,17,12,18,9,6,88,4,69,3,7)
    println(array.joinToString())
    for (outerindex in 0 until array.size){
        for (inner in outerindex+1 until array.size){
            if (array[outerindex]>array[inner]){
                val number=array[outerindex]
                array[outerindex]=array[inner]
                array[inner]=number

            }

        }
    }
    println(array.joinToString())
}