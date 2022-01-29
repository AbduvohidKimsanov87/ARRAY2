fun main() {
    var array=IntArray(33,{n->n+2})
    for (index in array.size/2-1 downTo 0){
        println("${index*2+1} ->${array[index*2+1]}")

    }
}