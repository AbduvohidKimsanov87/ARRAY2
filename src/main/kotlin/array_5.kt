fun main() {
    val errey=IntArray(10)
    errey[0]=1
    errey[1]=1
    for (item in 2 until 10){
        errey[item]=errey[item-2]+errey[item-1]
    }
    for((index,item) in errey.withIndex()) {
        println("$index-> $item")

    }
}