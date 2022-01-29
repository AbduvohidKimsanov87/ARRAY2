fun main() {
    var array=IntArray(20,{n->n+1})
    for (item in array){
        println("${item*2-2}  ")
    }
    for (item in array){
        println("${item*2-1}")
    }
}