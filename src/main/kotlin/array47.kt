fun main() {
    var array= intArrayOf(7,4,2,3,1,4,5,2,4,7)
    outer@for ((index,item) in array.withIndex()){
        for (innerIndex in 0 until index){
            if (item==array[innerIndex]){
                continue@outer

            }

        }
        println(item)

    }
}