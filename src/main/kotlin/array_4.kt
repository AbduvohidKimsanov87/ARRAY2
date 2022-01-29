import kotlin.math.pow

fun main() {
    var daslabkihad=2
    var maxraj=4
    var errey=DoubleArray(10,{ n-> 2.toDouble().pow(2*n+1)})

    for((index,item) in errey.withIndex()) {
        println("$index-> $item")

    }
}