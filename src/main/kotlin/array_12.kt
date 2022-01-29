fun main() {
    var array=IntArray(20, {n->2*n})
    for (item in 0..array.size/2-1){
        println("${item*2} -> ${array[item*2]}")

    }
}