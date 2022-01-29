fun main() {
    var array=IntArray(24, {n->n+1})
    for (item in array){
        println("${item*2-1}")
    }
    for (item in array.size-1 downTo   1)
        println("${item*2-2}")
}