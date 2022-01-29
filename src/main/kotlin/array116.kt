fun main() {
    val arrayA= intArrayOf(4,4,4,8,8,8,8,5,5,5,5,5,9,9)
    val arrayB=IntArray(arrayA.size)
    val arrayC=IntArray(arrayA.size)
    var index=0
    while (index<arrayA.size){
        var count=1
        for (innerindex in index+1 until arrayA.size){
            if (arrayA[index]==arrayA[innerindex]){
                count++

            }else{
                break
            }
            arrayC[index]=arrayA[index]

        }
        arrayB[index]=count
        println(count)
        index+=count


    }

    println(arrayA.joinToString())
    println(arrayB.joinToString())
    println(arrayC.joinToString())

}