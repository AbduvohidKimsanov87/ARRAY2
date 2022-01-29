fun main() {
    val errey=intArrayOf(4,5,7,8,6,9)
    var count=0
    for (index in  errey){
        if (index%2==0) continue
        count++
        println("$index   ")
    }
    println("toq sonlar soni $count")

}