fun main() {
    val a= intArrayOf(7,5,9,6,3,5,2,1,7,4,8)
    println(a.joinToString())
    for (index in 0 until a.size-1){
        a[index]=a[index+1]
    }
    a[a.size-1]=7
    println(a.joinToString ())
}