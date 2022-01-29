fun main() {
    val errey=IntArray(10, {n->n})
    for (index in errey.indices){
        val ayirma=errey.size-1-index
        println("$index-> ${errey[ayirma]}")
    }

//    for((index,item) in errey.withIndex()) {
//            println("$index-> $item")
//
//    }




}