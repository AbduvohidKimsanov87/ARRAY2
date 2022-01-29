fun main() {
    var array= intArrayOf(2,4,8,16,32,64,128,256)
    var mahraj=2
    var sum=0
    for (index in 1.. array.size-1){
        if (mahraj==array[index]/array[index-1]){
        sum=mahraj
        }
        else {
            sum=0
            break
        }




    }
    println(sum)
}