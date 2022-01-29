fun main() {
    val arraya = intArrayOf(5, 4, 2, 3, 7, 8, 6, 9, 4)
    var count = 0
    arraya.forEach { item->
        if (item%2==0){
            count++
        }
    }
    val tempArray=IntArray(count)
    count=0
    arraya.forEach { item->
        if (item%2==0){
            tempArray[count++]=item
        }
    }
    tempArray.forEach {
        println(it)
    }


}