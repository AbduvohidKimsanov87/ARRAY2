fun main() {
    var errey=IntArray(10)
    errey[0]=2
    errey[1]=4
    var sum=6
    for (index in 2 until errey.size){
         errey[index]=sum
        sum+=errey[index]
    }
    for((index,item) in errey.withIndex()) {
            println("$index-> $item")
}
}


