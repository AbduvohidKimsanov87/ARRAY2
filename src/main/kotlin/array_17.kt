fun main() {
    var array= intArrayOf(1,2,3,4,5,6,7,8,9)
    for (item in 0 until array.size/2 step 3) {
        println(array[item])
        println(array[item+1])
        println(array[array.size-1-item])
        println(array[array.size-2-item])

    }
    if (array.size%2==1){
        println(array[array.size/2])
    }
}