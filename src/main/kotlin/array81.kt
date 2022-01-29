fun main() {
    val k=3
    var a= intArrayOf(5,1,2,4,7,8,6,3,2,9,5,8,7,4,2,9)
    for (index in a.size-1-k downTo 0){
        a[index+k]=a[index]
    }
    for (index in 0..2){
        a[index]=0
    }
    println(a.joinToString())
}