fun main() {
    val array = intArrayOf(4, 5, 7, 8, 11, 12, 66, 47, 10)
    var firstEvenNumber = 0
    for (item in array){
        if (item%2==0){
            firstEvenNumber=item
            break
        }
    }
    for (index in array.indices){
        if (array[index]%2==0){
            array[index]+=firstEvenNumber
        }
    }
    println(array.joinToString())
}