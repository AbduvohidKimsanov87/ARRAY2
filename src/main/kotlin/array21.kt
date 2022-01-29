fun main() {
    var array= intArrayOf(1,3,5,2,6,5,8,5,6)
    val k=2
    val l=5
    var sum=0
    for (index in k..l){
        sum+=array[index]

    }
    println("sum= ${sum/2}")

}
