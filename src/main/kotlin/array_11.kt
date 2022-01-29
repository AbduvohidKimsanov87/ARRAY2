fun main() {
    var errey= IntArray(10, {n-> n})
    for ((index,item) in errey.withIndex()){
        if (index%3==0 && index!=0){
            println(" $index->$item")
        }
    }
}