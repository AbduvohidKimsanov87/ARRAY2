fun main() {
    var array= intArrayOf(8,5,4,7,9,6,2,5,1)
    var k=2
    var l=6
    var sum=0
    for (index in 0.. array.size-1){
        if (index>=k && index<=l) continue
        sum+=array[index]


    }
    println("${sum/2}")
}