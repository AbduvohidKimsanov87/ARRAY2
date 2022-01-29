fun main() {
    val array= intArrayOf(7,41,54,87,65,23,12,45,85,10,13)
    val k=2
    val m=5
    val ayirma=m-k
    println(array.joinToString())
    for (index in 0 until array.size-ayirma){
        if (index<k  ){
            print("${array[index]},")
            continue
        }
        array[index]=array[index+ayirma]
        print("${array[index]},")
    }

}